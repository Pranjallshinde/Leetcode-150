// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    // Helper function to check if two trees are mirror images
    private boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;      // both null → symmetric
        if (t1 == null || t2 == null) return false;     // one null, other not → not symmetric

        return (t1.val == t2.val)                       // values must be equal
            && isMirror(t1.left, t2.right)              // left of one ↔ right of other
            && isMirror(t1.right, t2.left);             // right of one ↔ left of other
    }
}
