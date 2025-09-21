class Solution {
    public TreeNode inorderPredecessor(TreeNode root, TreeNode p) {
        TreeNode predecessor = null;

        while (root != null) {
            if (p.val > root.val) {
                predecessor = root;  // possible predecessor
                root = root.right;   // go right to find larger
            } else {
                root = root.left;    // go left
            }
        }

        return predecessor;
    }
}
