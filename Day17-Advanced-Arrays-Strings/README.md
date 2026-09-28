# Day 17 — Advanced Arrays & Strings

## 🎯 Goal

Learn advanced array and string patterns used frequently in
medium-level LeetCode problems.

## 🧠 Topics Covered

- Kadane's Algorithm
- Prefix/Suffix Products
- Sliding Window
- Frequency Counting
- Two Pointers
- Sorting + Two Pointers
- HashMap / HashSet
- Dynamic Window Expansion and Shrinking
- Greedy Array Traversal

## 📚 Problems

| # | LeetCode | Problem | Main Pattern |
|---|---:|---|---|
| 1 | 121 | Best Time to Buy and Sell Stock | Greedy |
| 2 | 238 | Product of Array Except Self | Prefix/Suffix |
| 3 | 53 | Maximum Subarray | Kadane's Algorithm |
| 4 | 3 | Longest Substring Without Repeating Characters | Sliding Window |
| 5 | 424 | Longest Repeating Character Replacement | Sliding Window |
| 6 | 15 | 3Sum | Sorting + Two Pointers |
| 7 | 11 | Container With Most Water | Two Pointers |
| 8 | 76 | Minimum Window Substring | Advanced Sliding Window |

## 🔑 Important Patterns

### 1. Greedy

Make the best decision at each step while maintaining
the information needed for future decisions.

### 2. Prefix / Suffix

Store information about elements before and after the
current position.

### 3. Sliding Window

Maintain a dynamic range:

left → [ window ] ← right

Expand the window when possible and shrink it when
the window becomes invalid.

### 4. Two Pointers

Use two indexes to avoid unnecessary nested loops.

Common examples:

- left / right
- slow / fast

### 5. Kadane's Algorithm

Used to find the maximum sum of a contiguous subarray.

Core idea:

current = max(num, current + num)

### 6. Frequency Counting

Use:

HashMap
HashSet
int[]

to track character or number frequencies.

## ⏱️ Complexity Goals

Try to recognize these common complexities:

O(1)
O(log n)
O(n)
O(n log n)
O(n²)

Avoid unnecessary O(n²) solutions when a two-pointer
or sliding-window solution can achieve O(n).

## 🧠 Key Questions

Before coding, ask:

1. Can I use two pointers?
2. Can I use a sliding window?
3. Can I store previous information?
4. Can prefix/suffix information help?
5. Can sorting simplify the problem?
6. Can I avoid nested loops?

## 💡 Main Takeaway

Advanced array and string problems are often solved by
recognizing the correct pattern rather than brute force.
