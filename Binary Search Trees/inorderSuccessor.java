class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode successor = null;

        while (root != null) {
            if (p.val < root.val) {
                successor = root;   // possible successor
                root = root.left;   // go left to find smaller
            } else {
                root = root.right;  // go right to find larger
            }
        }

        return successor;
    }
}
