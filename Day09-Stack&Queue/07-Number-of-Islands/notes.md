# 200. Number of Islands

## Pattern
BFS + Queue.

## Approach

Every '1' represents land.

When we find an unvisited land cell:

1. Count a new island.
2. Start BFS.
3. Visit all connected land cells.
4. Mark visited cells as '0'.

The queue processes cells level by level.

## Complexity

Time: O(rows × cols)
Space: O(rows × cols)

## Key Takeaway

Queue is commonly used for:

BFS → Breadth-First Search

When a problem asks you to explore neighboring nodes level by level, think Queue.
