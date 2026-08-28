/**
 * 13. Roman to Integer
 * Difficulty: Easy | Tags: Hash Table, Math, String
 * https://leetcode.com/problems/roman-to-integer/
 *
 * Pattern: Hash Map (Right-to-Left Scan)
 * Key insight: Scan right to left; subtract a numeral's value when it is smaller than the numeral to its right (subtractive notation) and add it otherwise.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Map size is fixed to 7 Roman numeral characters
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int r = map.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
          int  t = map.get(s.charAt(i));
          int  b = map.get(s.charAt(i + 1));
            if (a < b) {
                r = r - a;
            } else {
                r = r + a;
            }
        }
        return r;
    }
}
