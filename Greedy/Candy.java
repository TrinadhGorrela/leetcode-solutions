/**
 * 135. Candy
 * Difficulty: Hard | Tags: Array, Greedy
 * https://leetcode.com/problems/candy/
 *
 * Pattern: Greedy (Two-Pass Peak Rule)
 * Key insight: Assign 1 candy each, then enforce the left-to-right rule (t[i] = t[i-1]+1 when rating rises) in a forward pass and the right-to-left rule (t[i] = max(t[i], t[i+1]+1)) in a backward pass; the maxima of the two passes satisfy both neighbors.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses an auxiliary array
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class Candy {
    public int candy(int[] ratings) {
        int[] t = new int[ratings.length];
        Arrays.fill(t, 1);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i - 1] < ratings[i]) {
                t[i] = Math.max(t[i], t[i - 1] + 1);
            }
        }

        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i + 1] < ratings[i]) {
                t[i] = Math.max(t[i], t[i + 1] + 1);
            }
        }

        int s = 0;
        for (int i = 0; i < ratings.length; i++) {
            s += t[i];
        }

        return s;
    }
}
