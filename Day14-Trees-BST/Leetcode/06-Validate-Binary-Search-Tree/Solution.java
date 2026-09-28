class Solution {

    public boolean isValidBST(TreeNode root) {

        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(
            TreeNode node,
            long min,
            long max) {

        if (node == null) {
            return true;
        }

        // Current value must be inside the valid range
        if (node.val <= min || node.val >= max) {
            return false;
        }

        // Left subtree must be smaller
        // Right subtree must be larger
        return validate(node.left, min, node.val)
                && validate(node.right, node.val, max);
    }
}
