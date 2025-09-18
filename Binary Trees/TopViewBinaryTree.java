class Solution {
    class Pair {
        TreeNode node;
        int hd;  // horizontal distance

        Pair(TreeNode n, int h) {
            node = n;
            hd = h;
        }
    }

    public List<Integer> topView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Map<Integer, Integer> map = new TreeMap<>();  // hd -> node.val
        Queue<Pair> queue = new LinkedList<>();

        queue.offer(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            TreeNode node = current.node;
            int hd = current.hd;

            if (!map.containsKey(hd)) {
                map.put(hd, node.val);
            }

            if (node.left != null) {
                queue.offer(new Pair(node.left, hd - 1));
            }

            if (node.right != null) {
                queue.offer(new Pair(node.right, hd + 1));
            }
        }

        for (int val : map.values()) {
            result.add(val);
        }

        return result;
    }
}
