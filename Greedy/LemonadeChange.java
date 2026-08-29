/**
 * 860. Lemonade Change
 * Difficulty: Easy | Tags: Array, Greedy
 * https://leetcode.com/problems/lemonade-change/
 *
 * Pattern: Greedy (Cash Register / Change Making)
 * Key insight: Track the count of $5 and $10 bills; give change greedily, preferring a $10+$5 for a $20 and falling back to three $5s, returning false when no exact change is possible.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: first customer pays with $10 or $20 (returns false if no change), gives exact change preferring $10+$5 for $20, insufficient small bills (returns false)
 */
class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int five_count = 0;
        int ten_count = 0;
        for (int i : bills) {
            if (i == 5) {
                five_count++;
            } else if (i == 10) {
                ten_count++;
                if (five_count == 0) {
                    return false;
                }
                five_count--;
            } else {
                if (ten_count != 0 && five_count != 0) {
                    ten_count--;
                    five_count--;
                } else if (five_count >= 3) {
                    five_count -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
