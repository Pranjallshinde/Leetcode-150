public static TreeNode lowestCommonAncestorRec(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null) return null;

    if (p.val < root.val && q.val < root.val)
        return lowestCommonAncestorRec(root.left, p, q);
    else if (p.val > root.val && q.val > root.val)
        return lowestCommonAncestorRec(root.right, p, q);
    else
        return root;
}
