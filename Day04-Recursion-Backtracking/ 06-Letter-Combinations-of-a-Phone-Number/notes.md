# Notes — Letter Combinations

## Idea

Each digit maps to multiple letters.

Example:

2 → abc
3 → def

For "23":

ad
ae
af
bd
be
bf
cd
ce
cf

## Backtracking

At each level, choose one letter from the current digit.

Then move to the next digit.

## Pattern

Choose character
↓
Recursive call
↓
Undo character

## Key Learning

Backtracking can be used to explore combinations from multiple
choices at every level.
