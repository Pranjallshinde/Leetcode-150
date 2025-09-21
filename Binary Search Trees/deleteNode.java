class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            // Node found
            // Case 1 and 2: 0 or 1 child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Case 3: Node has 2 children
            TreeNode successor = findMin(root.right); // inorder successor
            root.val = successor.val; // copy value
            root.right = deleteNode(root.right, successor.val); // delete successor
        }

        return root;
    }

    // Helper to find minimum value node in the right subtree
    private TreeNode findMin(TreeNode node) {
        while (node.left != null)
            node = node.left;
        return node;
    }
}
