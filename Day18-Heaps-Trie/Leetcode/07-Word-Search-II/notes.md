# Word Search II

## Pattern

Trie + DFS + Backtracking

## Idea

Instead of searching for every word independently:

1. Store all words in a Trie.
2. Start DFS from every board cell.
3. Follow only paths that exist in the Trie.
4. When a complete word is found, add it.

## Why Trie?

Without a Trie, we repeatedly search each word.

The Trie allows us to stop early when the current
character path cannot form any word.

## Backtracking

Mark the current board cell as visited.

Explore neighbors.

Restore the original character afterward.

## Complexity

Let:

W = number of words

L = maximum word length

The exact runtime depends on board size and Trie
branching, but Trie pruning significantly reduces
unnecessary searches.

## Key Idea

Trie + DFS turns multiple word searches into
one shared search structure.
