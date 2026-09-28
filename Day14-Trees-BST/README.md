# Day 14 — Trees & BST

Today I focused on Binary Trees, Tree Traversals,
and Binary Search Trees.

## Problems Solved

| # | LeetCode | Problem | Concept |
|---|---:|---|---|
| 1 | 104 | Maximum Depth of Binary Tree | DFS / Recursion |
| 2 | 226 | Invert Binary Tree | Recursion |
| 3 | 100 | Same Tree | Tree Recursion |
| 4 | 144 | Binary Tree Preorder Traversal | DFS |
| 5 | 102 | Binary Tree Level Order Traversal | BFS |
| 6 | 98 | Validate Binary Search Tree | BST |
| 7 | 235 | Lowest Common Ancestor of a BST | BST |
| 8 | 230 | Kth Smallest Element in a BST | Inorder |

## Binary Tree Basics

A binary tree node has:

- A value
- Left child
- Right child

```java
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
}
