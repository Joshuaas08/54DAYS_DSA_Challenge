class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : nums) {
            frequency.put(
                num,
                frequency.getOrDefault(num, 0) + 1
            );
        }

        List<Integer> numbers =
                new ArrayList<>(frequency.keySet());

        numbers.sort(
            (a, b) -> frequency.get(b) - frequency.get(a)
        );

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = numbers.get(i);
        }

        return result;
    }
}
