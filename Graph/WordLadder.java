/**
 * 127. Word Ladder
 * Difficulty: Hard | Tags: Hash Table, String, Breadth-First Search, Bidirectional Search
 * https://leetcode.com/problems/word-ladder/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> words = new HashSet<>(wordList);
        Queue<String> queue = new ArrayDeque<>();
        queue.offer(beginWord);

        Set<String> visited = new HashSet<>();
        visited.add(beginWord);

        int level = 1;

        if (!words.contains(endWord)) {
            return 0;
        }

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size != 0) {
                String word = queue.poll();
                if (word.equals(endWord)) {
                    return level;
                }

                for (int i = 0; i < word.length(); i++) {
                    char[] chars = word.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++) {
                        chars[i] = c;
                        String nxt = new String(chars);
                        if (words.contains(nxt) && !visited.contains(nxt)) {
                            visited.add(nxt);
                            queue.offer(nxt);
                        }
                    }
                }
                size--;
            }
            level++;
        }
        return 0;
    }
}
