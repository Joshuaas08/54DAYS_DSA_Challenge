# Day 10 — Two Pointers & Sliding Window Technique

Day 10 focuses on advanced Two Pointer and Sliding Window patterns.

The goal is not just to know how to use two pointers, but to recognize when a problem can be reduced from O(n²) or O(n³) to O(n).

Today we will focus on:

- Opposite-direction Two Pointers
- Variable Sliding Window
- Fixed Sliding Window
- Frequency-based Sliding Window
- HashMap + Sliding Window
- Monotonic Deque
- Counting Subarrays

---

# Problems

| # | Problem | LeetCode | Pattern |
|---|---|---:|---|
| 01 | Container With Most Water | 11 | Two Pointers |
| 02 | Trapping Rain Water | 42 | Two Pointers |
| 03 | Longest Subarray of 1's After Deleting One Element | 1493 | Sliding Window |
| 04 | Max Consecutive Ones III | 1004 | Sliding Window |
| 05 | Permutation in String | 567 | Fixed Sliding Window |
| 06 | Fruit Into Baskets | 904 | Sliding Window + HashMap |
| 07 | Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit | 1438 | Sliding Window + Deque |
| 08 | Subarray Product Less Than K | 713 | Sliding Window |

---

# 1. Two Pointers

Two pointers means maintaining two indices instead of using nested loops.

Common pattern:

```text
left →              ← right
