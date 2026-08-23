/**
 * 1189. Maximum Number of Balloons
 * Difficulty: Easy | Tags: Hash Table, String, Counting
 * https://leetcode.com/problems/maximum-number-of-balloons/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class MaximumNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            freq.put(text.charAt(i), freq.getOrDefault(text.charAt(i), 0) + 1);
        }

        int b = freq.getOrDefault('b', 0);
        int a = freq.getOrDefault('a', 0);
        int l = freq.getOrDefault('l', 0) / 2;
        int o = freq.getOrDefault('o', 0) / 2;
        int n = freq.getOrDefault('n', 0);

        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
    }
}
