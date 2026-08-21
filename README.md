# LeetCode Solutions in Java

A structured collection of LeetCode problem solutions, organized by pattern rather than by difficulty or submission order. Each solution includes the problem source, time/space complexity analysis, and a brief note on the approach used.

Built while preparing for SDE interviews at product-based companies — the goal was pattern mastery, not just problem count.

## Why this structure

Most LeetCode repos are just a flat list of files named after problem numbers. This one is organized by **pattern** (Sliding Window, Two Pointers, Backtracking, Graph, etc.) because that's how the problems are actually solved in an interview — you don't get told "this is a DP problem," you have to recognize it.

## Conventions used throughout

- **Iterative over recursive** wherever a clean iterative version exists (stacks/queues instead of recursion for traversal-heavy problems)
- **Bottom-up tabulation** for DP, not top-down memoization, unless the recursive structure is significantly clearer
- Every file documents its **LeetCode number, difficulty, tags, time complexity, and space complexity** in a header comment
- Edge cases (empty input, single element, boundary values) are handled explicitly, not assumed away

## Progress

| Topic | Problems Solved |
| ----- | ---------------- |
| Array | 84 |
| Backtracking | 18 |
| Binary Search | 13 |
| Dynamic Programming | 13 |
| Graph | 17 |
| Greedy | 15 |
| Hash Table | 9 |
| Linked List | 12 |
| Math | 40 |
| Matrix | 11 |
| Sliding Window | 11 |
| Stack | 5 |
| String | 5 |
| Tree | 14 |
| Two Pointers | 18 |
| **Total** | **285** |

*Currently working through Graphs (BFS/DFS) in depth. Heaps, Tries, and Union-Find are next.*

## Structure

```
leetcode-solutions/
├── Array/
├── Backtracking/
├── BinarySearch/
├── DynamicProgramming/
├── Graph/
├── Greedy/
├── HashTable/
├── LinkedList/
├── Math/
├── Matrix/
├── SlidingWindow/
├── Stack/
├── String/
├── Tree/
└── TwoPointers/
```

Each `.java` file is self-contained and named after the problem (e.g. `TwoSum.java`, `NumberOfIslands.java`), with a header comment like:

```java
/**
 * 200. Number of Islands
 * Difficulty: Medium | Tags: Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix
 * https://leetcode.com/problems/number-of-islands/
 *
 * Time Complexity: O(V + E) - Traverses all vertices and edges in the graph structure
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Empty array, null inputs, boundary values
 */
```

## Tech

- Java 17
- No external libraries — pure `java.util` (ArrayList, HashMap, ArrayDeque, PriorityQueue, etc.)

## About

Author: **Siva Satya Trinadh Gorrela**
[LinkedIn](https://linkedin.com/in/trinadhgorrela) · [GitHub](https://github.com/TrinadhGorrela)

Self-taught software developer transitioning from an ECE background into full-stack and backend engineering. This repo is part of ongoing DSA preparation for product-based company interviews.