# Implement Trie

## Pattern

Trie / Prefix Tree

## Structure

Every TrieNode contains:

children[]
isEnd

children[] stores the next characters.

isEnd tells us whether a complete word ends there.

## Example

Insert:

apple
app

The paths share:

a → p → p

But only the second p is marked as
end of a word for "app".

## Operations

insert:

O(L)

search:

O(L)

startsWith:

O(L)

Where L = word/prefix length.

## Key Idea

Trie stores characters along paths instead of
storing complete strings as separate objects.
