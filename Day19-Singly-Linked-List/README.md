# Day 19 — Singly Linked List

## 🎯 Goal

Learn how to work with singly linked lists using:

- Node traversal
- Pointer manipulation
- Fast and slow pointers
- Dummy nodes
- In-place reversal
- Linked list merging
- Cycle detection
- Finding the middle node
- Finding intersections

---

## 📚 Problems

| # | LeetCode | Problem | Main Pattern |
|---|---:|---|---|
| 1 | 206 | Reverse Linked List | Pointer Manipulation |
| 2 | 876 | Middle of the Linked List | Fast & Slow Pointers |
| 3 | 141 | Linked List Cycle | Floyd's Algorithm |
| 4 | 21 | Merge Two Sorted Lists | Dummy Node |
| 5 | 19 | Remove Nth Node From End | Two Pointers |
| 6 | 234 | Palindrome Linked List | Reverse Half |
| 7 | 143 | Reorder List | Split + Reverse + Merge |
| 8 | 160 | Intersection of Two Linked Lists | Two Pointers |

---

# 🧠 Singly Linked List

A linked list consists of nodes.

Each node contains:

1. Data
2. Reference to the next node

Example:

1 → 2 → 3 → 4 → null

---

# 🔑 Important Node Structure

LeetCode provides:

```java
class ListNode {

    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
