# Day 7 — Linked List

Today we are learning the most important Linked List patterns.

## Problems

| # | Problem | LeetCode |
|---|---|---|
| 01 | Reverse Linked List | 206 |
| 02 | Merge Two Sorted Lists | 21 |
| 03 | Linked List Cycle | 141 |
| 04 | Middle of the Linked List | 876 |
| 05 | Remove Nth Node From End | 19 |
| 06 | Palindrome Linked List | 234 |
| 07 | Intersection of Two Linked Lists | 160 |
| 08 | Reorder List | 143 |

## Important Patterns

### 1. Three Pointers

Used for:

- Reverse Linked List
- Reversing part of a linked list

```text
prev ← curr → next

2. Fast & Slow Pointers

Used for:

Finding middle
Detecting cycles
Finding parts of a linked list
slow → 1 step
fast → 2 steps
3. Dummy Node

Useful when:

Creating a new linked list
Removing nodes
Handling the head separately
dummy → head
4. Two-Pointer Gap

Useful for:

Nth node from the end

Keep two pointers a fixed distance apart.

5. Reverse + Merge

Useful for more advanced problems like:

Palindrome Linked List
