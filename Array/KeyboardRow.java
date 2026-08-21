/**
 * 500. Keyboard Row
 * Difficulty: Easy | Tags: Array, Hash Table, String
 * https://leetcode.com/problems/keyboard-row/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N * L) - N is number of words, L is max word length
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class KeyboardRow {
    public String[] findWords(String[] words) {
        String FirstRow = "qwertyuiop";
        String SecondRow = "asdfghjkl";
        String ThirdRow = "zxcvbnm";
        List<String> list = new LinkedList<>();
        for (String word : words) {
            int[] arr = new int[3];
            for (char ch : word.toLowerCase().toCharArray()) {
                if (FirstRow.indexOf(ch) != -1)
                    arr[0] = 1;
                else if (SecondRow.indexOf(ch) != -1)
                    arr[1] = 1;
                else if (ThirdRow.indexOf(ch) != -1)
                    arr[2] = 1;
            }
            int sum = arr[0] + arr[1] + arr[2];
            if (sum == 1)
                list.add(word);
        }
        String[] res = new String[list.size()];
        int i = 0;
        for (String word : list)
            res[i++] = word;
        return res;
    }
}
