# Notes — String to Integer (atoi)

## Idea

Convert a string into a 32-bit signed integer while following
the required parsing rules.

Example:

"42" → 42

"   -42" → -42

"4193 with words" → 4193

## Parsing Steps

1. Skip leading spaces.
2. Check for '+' or '-'.
3. Read consecutive digits.
4. Stop when a non-digit is found.
5. Handle integer overflow.

## Important Java Functions

charAt()
Character.isDigit()
length()

## Character to Integer

For a digit character:

char c = '7';

int digit = c - '0';

This gives:

7

## Overflow

Before:

result = result * 10 + digit

we check whether the next operation would exceed
Integer.MAX_VALUE.

## Complexity

Time: O(n)
Space: O(1)

## Key Learning

String parsing problems require careful handling of:
- spaces
- signs
- digits
- invalid characters
- overflow
