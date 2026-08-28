/**
 * 290. Word Pattern
 * Difficulty: Easy | Tags: Hash Table, String
 * https://leetcode.com/problems/word-pattern/
 *
 * Pattern: Hash Map + Set (Bijection Check)
 * Key insight: Map each pattern character to a word while a set records words already used, enforcing the one-to-one correspondence in both directions.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map=new HashMap<>();
        Set<String> set=new HashSet<>();
        String[] t=s.split(" ");
        if(pattern.length()!=t.length)
        	return false;
        for(int i=0;i<pattern.length();i++) {
        	if(map.containsKey(pattern.charAt(i))) {
        		if(!map.get(pattern.charAt(i)).equals(t[i])) {
        			return false;
        		}
        			
        	}
        	else {
        		if (set.contains(t[i])) {
        		    return false; 
        		}

        		map.put(pattern.charAt(i), t[i]);
        		set.add(t[i]);
        	}
        }
        return true; 
    }
}
