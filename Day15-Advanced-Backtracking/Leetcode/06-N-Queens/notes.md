# Notes — N-Queens

## Idea

Place N queens on an N × N board so that no two queens
can attack each other.

A queen cannot share:

- Same row
- Same column
- Same diagonal

## Approach

We place one queen per row.

For each row:

1. Try every column.
2. Check if the position is safe.
3. Place the queen.
4. Recursively process the next row.
5. Remove the queen.

## Backtracking

Choose position
↓
Check if safe
↓
Place queen
↓
Explore next row
↓
Remove queen

## Pruning

If a position is unsafe, don't explore it.

```java
if (!isSafe(...)) {
    continue;
}
