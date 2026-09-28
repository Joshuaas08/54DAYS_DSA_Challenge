# Notes — Letter Combinations of a Phone Number

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

## Approach

At each level:

1. Get the letters for the current digit.
2. Choose one letter.
3. Recursively process the next digit.
4. Remove the chosen letter.

## Important Java Functions

charAt()
toCharArray()
StringBuilder.append()
StringBuilder.deleteCharAt()

## Backtracking Pattern

Choose
↓
Explore next digit
↓
Undo

## Complexity

Time: O(4^n × n)

Space: O(n) excluding output.

## Key Learning

Backtracking is useful when each level has multiple choices
and we need to generate every possible combination.
