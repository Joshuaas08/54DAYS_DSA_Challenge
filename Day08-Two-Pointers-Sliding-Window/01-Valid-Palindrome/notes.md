# 125. Valid Palindrome

## Pattern
Two pointers moving toward each other.

## Approach

Use:

- left → starts at the beginning
- right → starts at the end

Skip characters that are not letters or digits.

Compare the characters at left and right.

If they are different, return false.

Move both pointers toward the center.

## Complexity

Time: O(n)
Space: O(1)

## Key Takeaway

When comparing elements from both ends of a string or array, think:

left → ← right
