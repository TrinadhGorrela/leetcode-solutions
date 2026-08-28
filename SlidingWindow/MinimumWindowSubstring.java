/**
 * 76. Minimum Window Substring
 * Difficulty: Hard | Tags: Hash Table, String, Sliding Window
 * https://leetcode.com/problems/minimum-window-substring/
 *
 * Pattern: Sliding Window (Two-Frequency Matching)
 * Key insight: Slide a window whose counts of each ASCII char dominate t's counts (isPos check), then shrink the left edge while the window still covers t to minimize its length.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only allocates fixed-size arrays independent of input scaling
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        int[] freq1 = new int[128];
        int[] freq2 = new int[128];

        int min = Integer.MAX_VALUE;
        int left = 0;
        String res = "";

        if (s.length() < t.length()) {
            return "";
        }

        for (int i = 0; i < t.length(); i++) {
            freq1[t.charAt(i)]++;
        }

        for (int right = 0; right < s.length(); right++) {
            freq2[s.charAt(right)]++;
            while (isPos(freq1, freq2)) {
                if (min > right - left + 1) {
                    min = right - left + 1;
                    res = s.substring(left, right + 1);
                }
                freq2[s.charAt(left)]--;
                left++;
            }

        }
        return res;
    }

    public static boolean isPos(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
