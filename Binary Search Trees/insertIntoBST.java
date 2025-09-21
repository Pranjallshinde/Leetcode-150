
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        // If tree is empty, create a new node
        if (root == null) {
            return new TreeNode(val);
        }

        // If value is smaller, go left
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } 
        // If value is greater, go right
        else if (val > root.val) {
            root.right = insertIntoBST(root.right, val);
        }
        // If value already exists, we usually don't insert duplicates in BST
        return root;
    }
}
