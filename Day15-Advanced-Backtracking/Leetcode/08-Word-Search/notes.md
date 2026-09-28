# Notes — Word Search

## Idea

Find whether a word exists in a grid.

We can move:

- Up
- Down
- Left
- Right

A cell cannot be used more than once in the same path.

## Approach

For every cell:

1. Check if it matches the first character.
2. Mark it as visited.
3. Explore four directions.
4. Restore the cell.

## Visited Technique

Instead of creating a separate visited array,
temporarily change the cell:

```java
char temp = board[row][col];

board[row][col] = '#';
