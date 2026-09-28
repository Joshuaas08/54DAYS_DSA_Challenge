# Day 20 — Advanced Singly Linked List

## 🎯 Goal

Build on basic linked-list skills and learn advanced
pointer manipulation techniques.

Topics:

- Reversing a portion of a list
- Swapping nodes
- Reversing nodes in groups
- Random pointers
- Merge Sort
- Merging K lists
- Linked-list arithmetic
- Recursive linked-list reversal

---

## 📚 Problems

| # | LeetCode | Problem | Main Pattern |
|---|---:|---|---|
| 1 | 92 | Reverse Linked List II | Pointer Manipulation |
| 2 | 24 | Swap Nodes in Pairs | Pointer Manipulation |
| 3 | 25 | Reverse Nodes in K-Group | Advanced Reversal |
| 4 | 138 | Copy List with Random Pointer | HashMap / Interweaving |
| 5 | 148 | Sort List | Merge Sort |
| 6 | 23 | Merge K Sorted Lists | Min Heap / Divide & Conquer |
| 7 | 2 | Add Two Numbers | Carry + Traversal |
| 8 | 206 | Reverse Linked List | Recursion |

---

# 🧠 Advanced Linked List Patterns

## 1. Partial Reversal

Sometimes we don't need to reverse
the entire list.

Example:

1 → 2 → 3 → 4 → 5

Reverse positions 2 to 4:

1 → 4 → 3 → 2 → 5

---

## 2. Group Reversal

Reverse nodes in groups of k.

Example:

1 → 2 → 3 → 4 → 5 → 6

k = 2

Result:

2 → 1 → 4 → 3 → 6 → 5

---

## 3. Random Pointer

A node may contain:

next
random

The random pointer can point to any node
or null.

We need to create completely independent copies.

---

## 4. Merge Sort

Linked lists are excellent candidates for Merge Sort.

Steps:

1. Find middle.
2. Split list.
3. Sort both halves.
4. Merge them.

Complexity:

O(n log n)

---

## 5. Merge K Lists

When multiple sorted lists must be merged,
a Min Heap can efficiently find the smallest
current node.

---

## 6. Carry

For Add Two Numbers:

digit = sum % 10
carry = sum / 10

---

# 🎯 Main Takeaway

Advanced linked-list problems are combinations
of the basic patterns learned on Day 19.

Think:

Split → Reverse → Merge

and:

Fast/Slow → Pointer Manipulation → Reconnect
