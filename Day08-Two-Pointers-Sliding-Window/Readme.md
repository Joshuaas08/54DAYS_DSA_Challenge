# Day 8 — Two Pointers & Sliding Window

Today we are learning two important array and string patterns:

- Two Pointers
- Sliding Window

## Problems

| # | Problem | LeetCode | Pattern |
|---|---|---:|---|
| 01 | Valid Palindrome | 125 | Two Pointers |
| 02 | Two Sum II | 167 | Two Pointers |
| 03 | 3Sum | 15 | Sorting + Two Pointers |
| 04 | Best Time to Buy and Sell Stock | 121 | Two Pointers |
| 05 | Maximum Average Subarray I | 643 | Fixed Sliding Window |
| 06 | Longest Substring Without Repeating Characters | 3 | Variable Sliding Window |
| 07 | Longest Repeating Character Replacement | 424 | Variable Sliding Window |
| 08 | Minimum Size Subarray Sum | 209 | Variable Sliding Window |

---

# Important Patterns

## 1. Two Pointers — Opposite Direction

Used when working from both ends.

```text
left →       ← right

Common examples:

Valid Palindrome
Two Sum II
3Sum
2. Two Pointers — Same Direction

Both pointers can move forward through the array.

left → right →

Useful when maintaining a valid range.

3. Fixed Sliding Window

The window size stays constant.

4. Variable Sliding Window

The window size changes depending on a condition.

Used in:

Longest Substring Without Repeating Characters
Longest Repeating Character Replacement
Minimum Size Subarray Sum
