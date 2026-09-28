# Notes — Palindrome Partitioning

## Idea

Partition the string so every part is a palindrome.

Example:

"aab"

Valid:

["a","a","b"]

["aa","b"]

## Backtracking

At every position, try different ending positions.

For every substring:

1. Check palindrome.
2. Choose it if valid.
3. Explore remaining string.
4. Undo.

## Pruning

If a substring is not a palindrome:

```java
continue;
