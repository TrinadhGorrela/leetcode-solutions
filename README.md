<p align="center">
  <img src="https://img.shields.io/badge/Solutions-310%20%7C%20310%20Java%20%2B%204%20SQL-4B8BBE?style=for-the-badge&logo=leetcode&logoColor=FFA116"/>
  <img src="https://img.shields.io/badge/Language-Java%2017-E76F00?style=for-the-badge&logo=java&logoColor=white"/>
  <img src="https://img.shields.io/badge/Easy-154-44B77B?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Medium-141-FCB833?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Hard-11-EB5C5C?style=for-the-badge"/>
</p>

<h1 align="center">LeetCode Solutions in Java</h1>

<p align="center">
  <b>Pattern-first, interview-ready DSA solutions.</b><br/>
  Not a scatter of answers — a <i>playbook</i>: every file maps to a pattern you can recognize and reproduce on a whiteboard.
</p>

<p align="center">
  <a href="https://linkedin.com/in/trinadhgorrela"><img src="https://img.shields.io/badge/-LinkedIn-0A66C2?style=flat-square&logo=linkedin&logoColor=white"/></a>
  <a href="https://github.com/TrinadhGorrela"><img src="https://img.shields.io/badge/-GitHub-181717?style=flat-square&logo=github&logoColor=white"/></a>
  <a href="https://leetcode.com/u/Trinadh462/"><img src="https://img.shields.io/badge/-LeetCode-FFA116?style=flat-square&logo=leetcode&logoColor=black"/></a>
</p>

---

Most LeetCode repos are flat folders of files named after problem numbers. This one is different — it's organized by **algorithmic pattern**, because that's how problems are actually *solved* in an interview: you're never told "this is a DP problem." You have to recognize it.

If you're grinding for **SDE interviews at product-based companies**, this is a study guide, not just an answer key.

## Table of Contents

- [Why pattern-based?](#why-pattern-based)
- [Quick stats](#quick-stats)
- [Progress by pattern](#progress-by-pattern)
- [Conventions used throughout](#conventions-used-throughout)
- [Repository structure](#repository-structure)
- [Tech stack](#tech-stack)
- [Updates](#updates)
- [Author](#author)

## Why pattern-based?

Interviews don't hand you a topic tag. A *"sliding window"* problem, a *"two pointers"* problem, and a *"binary search"* problem can all look superficially alike. The ability that gets you hired is the ability to **map a fresh, weird problem onto a known pattern**.

Each subdirectory here is a studied pattern:

- **All** solutions in a folder share the same recognition heuristic — read any two and the pattern clicks.
- **Difficulty is a by-product**, not the organizing idea. You build up from recognizing a pattern to mastering it.
- **Edge cases are called out explicitly** (empty input, single element, boundaries) — the exact things that decide pass/fail on the judge and in review.

I built this the way you actually study: practice first, notice the recurring shapes, then file each solution under the shape it belongs to.

## Quick stats

| Metric | Value |
| ------ | ----- |
| **Total solutions** | **310** (306 Java + 4 SQL) |
| Difficulty | 🟢 154 Easy · 🟡 141 Medium · 🔴 11 Hard |
| Patterns covered | **16** |
| Language | Java 17 — standard library only, zero external deps |
| Structure | Organized by **algorithmic pattern**, self-contained files |

## Progress by pattern

| Pattern | Solved | Easy | Medium | Hard |
| ------- | ------ | :---: | :----: | :---: |
| Array | 63 | 45 | 17 | 1 |
| Math | 36 | 27 | 9 | 0 |
| Greedy | 31 | 9 | 21 | 1 |
| Two Pointers | 24 | 13 | 9 | 2 |
| Graph | 21 | 5 | 14 | 2 |
| Backtracking | 18 | 1 | 14 | 3 |
| Dynamic Programming | 18 | 5 | 13 | 0 |
| Tree | 17 | 9 | 8 | 0 |
| Sliding Window | 16 | 5 | 9 | 2 |
| Binary Search | 13 | 6 | 7 | 0 |
| Linked List | 13 | 7 | 6 | 0 |
| Matrix | 13 | 5 | 8 | 0 |
| Hash Table | 8 | 8 | 0 | 0 |
| String | 8 | 7 | 1 | 0 |
| Stack | 6 | 2 | 4 | 0 |
| Divide and Conquer | 1 | 0 | 1 | 0 |
| **Total (Java)** | **306** | **154** | **141** | **11** |
| Database (SQL) | 4 | — | — | — |
| **Grand total** | **310** | **154** | **141** | **11** |

## Conventions used throughout

- **Iterative over recursive** wherever a clean iterative version exists (stacks/queues instead of recursion for traversal-heavy problems).
- **Bottom-up tabulation** for DP, not top-down memoization — unless the recursive structure is significantly clearer.
- Every file documents its **LeetCode number, difficulty, tags, time complexity, and space complexity** in a header comment.
- **Edge cases** (empty input, single element, boundary values) are handled explicitly, not assumed away.
- Solutions are **self-contained** and named after the problem — no cross-file imports to hunt down.

## Repository structure

```
leetcode-solutions/
├── Array/              ── 63
├── Backtracking/       ── 18
├── BinarySearch/       ── 13
├── Divide and Conquer/ ── 1
├── DynamicProgramming/ ── 18
├── Graph/              ── 21
├── Greedy/             ── 31
├── HashTable/          ── 8
├── LinkedList/         ── 13
├── Math/               ── 36
├── Matrix/             ── 13
├── SlidingWindow/      ── 16
├── Stack/              ── 6
├── String/             ── 8
├── Tree/               ── 17
└── TwoPointers/        ── 24
```

## Tech stack

- **Java 17**
- **No external libraries** — pure `java.util` (`ArrayList`, `HashMap`, `ArrayDeque`, `PriorityQueue`, etc.)
- SQL solutions use plain, portable query syntax

## Updates

> **This repository is updated daily** — new solutions are added as problems are solved, keeping the collection consistently fresh and growing.

## Author

<p align="left">
  <b>Siva Satya Trinadh Gorrela</b><br/>
  Self-taught developer crossing from an ECE background into full-stack & backend engineering.<br/>
  <a href="https://linkedin.com/in/trinadhgorrela">LinkedIn</a> · <a href="https://github.com/TrinadhGorrela">GitHub</a>
</p>

