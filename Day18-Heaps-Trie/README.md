# Day 18 — Heaps & Trie

## 🎯 Goal

Learn how to use:

- Min Heap
- Max Heap
- PriorityQueue
- Heap for Top-K problems
- Trie / Prefix Tree
- Trie + DFS
- Heap + Matrix traversal

---

## 📚 Problems

| # | LeetCode | Problem | Main Pattern |
|---|---:|---|---|
| 1 | 215 | Kth Largest Element in an Array | Min Heap |
| 2 | 1046 | Last Stone Weight | Max Heap |
| 3 | 703 | Kth Largest Element in a Stream | Min Heap |
| 4 | 347 | Top K Frequent Elements | Heap + HashMap |
| 5 | 208 | Implement Trie | Trie |
| 6 | 211 | Design Add and Search Words | Trie + DFS |
| 7 | 212 | Word Search II | Trie + DFS |
| 8 | 378 | Kth Smallest Element in a Sorted Matrix | Min Heap |

---

# 🧠 Heap

A heap is a tree-based data structure that gives
quick access to the smallest or largest element.

Java provides:

PriorityQueue

---

## Min Heap

Smallest element stays at the top.

```java
PriorityQueue<Integer> minHeap =
    new PriorityQueue<>();
