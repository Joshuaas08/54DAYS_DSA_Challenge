# Day 9 — Stack & Queue

Today we are learning two fundamental data structures:

- Stack
- Queue

We will also learn:

- Monotonic Stack
- Monotonic Queue
- BFS
- Deque

---

# Problems

| # | Problem | LeetCode | Pattern |
|---|---|---:|---|
| 01 | Valid Parentheses | 20 | Stack |
| 02 | Min Stack | 155 | Stack + Auxiliary Stack |
| 03 | Implement Queue Using Stacks | 232 | Two Stacks |
| 04 | Daily Temperatures | 739 | Monotonic Stack |
| 05 | Next Greater Element I | 496 | Monotonic Stack |
| 06 | Evaluate Reverse Polish Notation | 150 | Stack |
| 07 | Number of Islands | 200 | BFS + Queue |
| 08 | Sliding Window Maximum | 239 | Deque + Monotonic Queue |

---

# Important Concepts

## 1. Stack

Stack follows:

LIFO

Last In → First Out

Example:

        ┌─────┐
        │  3  │ ← Top
        ├─────┤
        │  2  │
        ├─────┤
        │  1  │
        └─────┘

Common operations:

```java
stack.push(x);
stack.pop();
stack.peek();
stack.isEmpty();


