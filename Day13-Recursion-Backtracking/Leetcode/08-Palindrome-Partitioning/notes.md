# Notes — Palindrome Partitioning

## Idea

Partition a string so that every substring in the partition
is a palindrome.

Example:

s = "aab"

Valid partition:

["a", "a", "b"]

Another valid partition:

["aa", "b"]

## Approach

Starting from each position:

1. Try every possible ending position.
2. Check if the substring is a palindrome.
3. If it is, choose it.
4. Recursively process the remaining string.
5. Undo the choice.

## Example

"aab"

Try:

"a" → explore "ab"

"aa" → explore "b"

"b" → complete solution

## Important Java Functions

substring()
charAt()

## Complexity

Time: O(n × 2^n) approximately, depending on palindrome
checking and output size.

Space: O(n) recursion depth excluding output.

## Key Learning

Backtracking can be combined with a condition.

Here:

isPalindrome(...)

acts as a filter that prevents invalid branches.
