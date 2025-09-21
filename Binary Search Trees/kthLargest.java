class Solution {
    private int count = 0;   // Counts nodes visited
    private int result = -1; // Stores k-th largest value

    public int kthLargest(TreeNode root, int k) {
        reverseInorder(root, k);
        return result;
    }

    private void reverseInorder(TreeNode node, int k) {
        if (node == null) return;

        reverseInorder(node.right, k);  // Visit right subtree first (largest elements)

        count++;
        if (count == k) {               // Found k-th largest
            result = node.val;
            return;
        }

        reverseInorder(node.left, k);   // Visit left subtree
    }
}
