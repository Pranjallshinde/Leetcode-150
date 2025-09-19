class Solution {
    TreeNode prev = null;

    public void flatten(TreeNode root) {
        if (root == null) return;

        // Recurse on right subtree first
        flatten(root.right);
        // Then left subtree
        flatten(root.left);

        // Change pointers
        root.right = prev;
        root.left = null;
        prev = root;
    }
}
