# Design Add and Search Words Data Structure

## Pattern

Trie + DFS / Backtracking

## Special Rule

'.' can represent any character.

Example:

search("b..")

can match:

bad
bat
bag

## Normal Character

Follow the corresponding Trie child.

## '.'

Try every available child.

This creates branching, so DFS is required.

## Complexity

addWord:

O(L)

search:

O(26^L) worst case

Typical cases are much faster.

## Key Idea

Trie handles prefixes.

DFS handles the wildcard '.'.
