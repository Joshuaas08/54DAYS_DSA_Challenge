# Day 10 — Searching Algorithms

Day 10 focuses on searching algorithms and the most important Binary Search patterns.

The goal is not just to memorize normal Binary Search, but to recognize different situations where Binary Search can reduce the search space efficiently.

Today we will cover:

- Linear Search
- Binary Search
- Lower Bound
- Upper Bound
- First Occurrence
- Last Occurrence
- Search Insert Position
- Rotated Sorted Array
- Binary Search on Numerical Range
- Binary Search on the Answer

---

# Problems

| # | Problem | LeetCode | Pattern |
|---|---|---:|---|
| 01 | Linear Search | — | Linear Search |
| 02 | Binary Search | 704 | Basic Binary Search |
| 03 | Search Insert Position | 35 | Lower Bound |
| 04 | Find First and Last Position | 34 | First / Last Occurrence |
| 05 | Search in Rotated Sorted Array | 33 | Modified Binary Search |
| 06 | Find Minimum in Rotated Sorted Array | 153 | Modified Binary Search |
| 07 | Sqrt(x) | 69 | Binary Search on Range |
| 08 | Koko Eating Bananas | 875 | Binary Search on Answer |

---

# 1. Linear Search

Linear Search checks every element one by one.

Basic pattern:

```java
for (int i = 0; i < nums.length; i++) {

    if (nums[i] == target) {
        return i;
    }
}

return -1;
