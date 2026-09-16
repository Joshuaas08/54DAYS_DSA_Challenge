# Notes — Longest Common Prefix

## Idea

Find the longest string that appears at the beginning of
every string.

Example:

["flower", "flow", "flight"]

Common prefix:

"fl"

## Important Java Functions

startsWith()
substring()
length()
isEmpty()

## Approach

1. Assume the first string is the prefix.
2. Compare it with every other string.
3. If a string doesn't start with the prefix,
   remove the last character.
4. Continue until the prefix matches.
5. Return the remaining prefix.

## Example

prefix = "flower"

Compare with "flow":

"flower" does not match.

Remove characters:

"flowe"
"flow"

Now it matches.

## Complexity

Time: O(S)

S = total number of characters across all strings.

Space: O(1) auxiliary space.

## Key Learning

startsWith() is useful when checking whether a string
begins with another string.
