# Notes — Binary Tree Level Order Traversal

## Idea

Visit the tree one level at a time.

This is called BFS:

Breadth-First Search

## Example

        3
       / \
      9   20
         /  \
        15   7

Output:

[
    [3],
    [9,20],
    [15,7]
]

## Important Data Structure

Queue

```java
Queue<TreeNode> queue = new LinkedList<>();
