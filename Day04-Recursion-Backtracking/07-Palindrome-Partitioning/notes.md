# Notes — Palindrome Partitioning

## Idea

Partition the string so every substring is a palindrome.

Example:

"aab"

Possible answer:

["a", "a", "b"]
["aa", "b"]

## Backtracking

At every position, try every possible ending position.

Before choosing a substring, check whether it is a palindrome.

## Flow

Choose substring
↓
Check palindrome
↓
Explore
↓
Undo

## Key Learning

Backtracking can be combined with a condition/check to prune
invalid choices.
