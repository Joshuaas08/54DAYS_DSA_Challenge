# Notes — Subsets

## Idea

For every element, we can either:

- Include it
- Don't include it

We explore all possible choices using backtracking.

## Example

nums = [1,2]

Subsets:

[]
[1]
[2]
[1,2]

## Backtracking Pattern

Choose
↓
Explore
↓
Undo

```java
current.add(nums[i]);

backtrack(...);

current.remove(current.size() - 1);
