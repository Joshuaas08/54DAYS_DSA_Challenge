# Notes — Combination Sum II

## Difference from Combination Sum I

Combination Sum I:

A number can be reused.

Combination Sum II:

Each number can only be used once.

Therefore:

Combination Sum I → i

Combination Sum II → i + 1

## Duplicate Handling

Sort first:

```java
Arrays.sort(candidates);
