# Notes — Permutations II

## Idea

Same as Permutations, but the input can contain duplicates.

Example:

[1,1,2]

We should NOT generate duplicate permutations.

## Important Step

Sort the array first.

```java
Arrays.sort(nums);
