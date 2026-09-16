# Notes — N-Queens

## Idea

Place N queens on an N × N chessboard so that no two queens
attack each other.

A queen cannot share:

- Same row
- Same column
- Same diagonal

## Backtracking

We place exactly one queen per row.

For each row:

1. Try every column
2. Check if the position is safe
3. Place the queen
4. Recursively solve the next row
5. Remove the queen if it leads to a dead end

## Pattern

Try
↓
Check
↓
Choose
↓
Explore
↓
Undo

## Key Learning

N-Queens demonstrates backtracking with constraint checking
and pruning.

It is one of the classic backtracking interview problems.
