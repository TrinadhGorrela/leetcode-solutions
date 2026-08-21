/**
 * 387. First Unique Character in a String
 * Difficulty: Easy | Tags: Hash Table, String, Queue, Counting
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 *
 * Pattern: Hash Table
 * Key insight: Systematically processes the input relying on hash table principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map=new HashMap<>();
    	for(int i=0;i<s.length();i++) {
    		map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
    	}
    	for(int i=0;i<s.length();i++) {
    		if(map.get(s.charAt(i))==1) {
    			return i;
    		}
    	}
        return -1; 
    }   
    
}
