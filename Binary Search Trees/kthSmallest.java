class Solution {
    private int count = 0;   // Counts nodes visited
    private int result = -1; // Stores k-th smallest value

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return result;
    }

    private void inorder(TreeNode node, int k) {
        if (node == null) return;

        inorder(node.left, k);      // Visit left subtree

        count++;
        if (count == k) {           // Found k-th smallest
            result = node.val;
            return;
        }

        inorder(node.right, k);     // Visit right subtree
    }
}
