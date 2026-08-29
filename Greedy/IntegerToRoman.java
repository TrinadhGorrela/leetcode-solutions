/**
 * 12. Integer to Roman
 * Difficulty: Medium | Tags: Hash Table, Math, String
 * https://leetcode.com/problems/integer-to-roman/
 *
 * Pattern: Greedy (Ordered Roman Value Lookup)
 * Key insight: Walk a descending ordered list of roman value/symbol pairs (including subtractive combos like 900/CM), greedily appending the largest symbol that fits and subtracting its value from num.
 *
 * Time Complexity: O(1) - Work bounded by fixed constraints (Roman numerals max ~3999, 13 rules)
 * Space Complexity: O(1) - Fixed size array/map and bounded string output
 *
 * Edge Cases Handled: num = 1, subtractive combinations (4, 9, 40, 90, 400, 900), exact multiples of 10/100/1000, repeated symbols (e.g., 2, 3, 20, 30)
 */
class IntegerToRoman {
    public String intToRoman(int num) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        StringBuilder roman = new StringBuilder();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            while (num >= entry.getKey()) {
                roman.append(entry.getValue());
                num = num - entry.getKey();
            }
        }
        return roman.toString();
    }
}
