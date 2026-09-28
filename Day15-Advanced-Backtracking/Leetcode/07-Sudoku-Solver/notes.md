# Notes — Sudoku Solver

## Idea

Fill every empty cell with a digit from 1 to 9.

A digit is valid only if it doesn't already exist in:

- Same row
- Same column
- Same 3x3 box

## Backtracking

For every empty cell:

1. Try digits 1-9.
2. Check if the digit is valid.
3. Place the digit.
4. Recursively solve the remaining board.
5. If it fails, remove the digit.
6. Try another digit.

## Important Pattern

```java
board[row][col] = digit;

if (solve(board)) {
    return true;
}

board[row][col] = '.';
