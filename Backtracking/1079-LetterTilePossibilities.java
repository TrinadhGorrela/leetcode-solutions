/**
 * 1079. Letter Tile Possibilities
 * Difficulty: Medium | Tags: Hash Table, String, Backtracking, Counting
 * https://leetcode.com/problems/letter-tile-possibilities/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class LetterTilePossibilities {
    public int numTilePossibilities(String tiles) {
        Set<List<String>> res = new HashSet<>();
        boolean[] used = new boolean[tiles.length()];
        solve(res, new ArrayList<>(), used, tiles);
        return res.size();
    }

    public static void solve(Set<List<String>> res, List<String> temp, boolean[] used, String tiles) {
        if (temp.size() != 0) {
            res.add(new ArrayList<>(temp));
        }

        if (temp.size() == tiles.length()) {
            return;
        }

        for (int i = 0; i < tiles.length(); i++) {
            if (!used[i]) {
                temp.add(tiles.charAt(i) + "");
                used[i] = true;
                solve(res, temp, used, tiles);
                temp.remove(temp.size() - 1);
                used[i] = false;
            }
        }
    }
}
