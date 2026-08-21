/**
 * 12. Integer to Roman
 * Difficulty: Medium | Tags: Hash Table, Math, String
 * https://leetcode.com/problems/integer-to-roman/
 *
 * Pattern: Hash Table
 * Key insight: Systematically processes the input relying on hash table principles.
 *
 * Time Complexity: O(1) - Work bounded by fixed constraints (Roman numerals max ~3999, 13 rules)
 * Space Complexity: O(1) - Fixed size array/map and bounded string output
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
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
