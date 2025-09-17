class Solution {
    private int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root); // Start DFS
        return diameter;
    }

    private int height(TreeNode node) {
        if (node == null) return 0;

        int left = height(node.left);
        int right = height(node.right);

        // Update max diameter if longer path is found
        diameter = Math.max(diameter, left + right);

        return Math.max(left, right) + 1; // Return height
    }
}
