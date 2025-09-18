class Solution {
    List<Integer> result = new ArrayList<>();
    int maxLevel = 0;

    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 1);  // Start at level 1
        return result;
    }

    private void dfs(TreeNode node, int level) {
        if (node == null) return;

        if (level > maxLevel) {
            result.add(node.val);
            maxLevel = level;// when left level is greater than right update maxlevel
        }

        dfs(node.right, level + 1);  // Go right first
        dfs(node.left, level + 1);   // Then left
    }
}
