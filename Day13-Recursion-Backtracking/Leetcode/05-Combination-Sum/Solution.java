class Solution {

    public List<List<Integer>> combinationSum(
            int[] candidates,
            int target) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(
            candidates,
            target,
            0,
            new ArrayList<>(),
            result
        );

        return result;
    }

    private void backtrack(
            int[] candidates,
            int target,
            int start,
            List<Integer> current,
            List<List<Integer>> result) {

        // Valid combination
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Invalid path
        if (target < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            // Choose
            current.add(candidates[i]);

            // Explore
            // Use i again because a number can be reused
            backtrack(
                candidates,
                target - candidates[i],
                i,
                current,
                result
            );

            // Undo
            current.remove(current.size() - 1);
        }
    }
}
