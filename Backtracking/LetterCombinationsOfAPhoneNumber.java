/**
 * 17. Letter Combinations of a Phone Number
 * Difficulty: Medium | Tags: Hash Table, String, Backtracking
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 *
 * Pattern: Backtracking
 * Key insight: Systematically processes the input relying on backtracking principles.
 *
 * Time Complexity: O(2^N) or O(N!) - Explores combinatorial possibilities via iterative BFS-style expansion
 * Space Complexity: O(4^N * N) - N is digits length, stores all combinations
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
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
