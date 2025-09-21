public static int height(TreeNode root) {
        if (root == null) return -1; // if height of empty tree is -1
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
