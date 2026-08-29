/**
 * 17. Letter Combinations of a Phone Number
 * Difficulty: Medium | Tags: Hash Table, String, Backtracking
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 *
 * Pattern: Iterative BFS (Level-by-Level Expansion)
 * Key insight: Build combinations incrementally: start with the empty string and, for each digit, append each of its letters to every string produced so far.
 *
 * Time Complexity: O(2^N) or O(N!) - Explores combinatorial possibilities via iterative BFS-style expansion
 * Space Complexity: O(4^N * N) - N is digits length, stores all combinations
 *
 * Edge Cases Handled: empty digits string (returns empty list), single digit, repeated digits (e.g., "22"), four-letter digits (7/9)
 */
class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> res = new ArrayList<>();
        res.add("");

        for (int i = 0; i < digits.length(); i++) {
            List<String> temp = new ArrayList<>();
            String curr = map.get(digits.charAt(i));
            for (int j = 0; j < res.size(); j++) {
                for (int k = 0; k < curr.length(); k++) {
                    temp.add(res.get(j) + curr.charAt(k));
                }
            }
            res = temp;
        }
        return res;
    }
}
