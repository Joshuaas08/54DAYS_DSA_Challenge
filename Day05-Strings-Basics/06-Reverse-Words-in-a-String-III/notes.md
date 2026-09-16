# Notes — Reverse Words in a String III

## Idea

Reverse every individual word while keeping the word order
the same.

Example:

"Let's take LeetCode contest"

becomes:

"s'teL ekat edoCteeL tsetnoc"

## Important Java Functions

split()
StringBuilder
reverse()
append()

## Why StringBuilder?

String is immutable in Java.

StringBuilder allows us to modify/build strings efficiently.

## Approach

1. Split the sentence into words.
2. Create a StringBuilder for each word.
3. Reverse each word.
4. Append it to the result.
5. Add spaces between words.

## Complexity

Time: O(n)
Space: O(n)

## Key Learning

Use StringBuilder when repeatedly modifying or building strings.
