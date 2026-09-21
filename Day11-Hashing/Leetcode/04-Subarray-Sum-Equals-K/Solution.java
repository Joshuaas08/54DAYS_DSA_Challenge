from collections import defaultdict

class Solution:
    def subarraySum(self, nums, k):
        prefix_count = defaultdict(int)

        # Empty prefix
        prefix_count[0] = 1

        prefix_sum = 0
        result = 0

        for num in nums:
            prefix_sum += num

            # prefix_sum - previous_sum = k
            result += prefix_count[prefix_sum - k]

            prefix_count[prefix_sum] += 1

        return result
