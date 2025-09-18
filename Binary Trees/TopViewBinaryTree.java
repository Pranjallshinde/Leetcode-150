import java.util.*;

// Basic binary tree node
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int v) { val = v; }
}

public class TopViewBinaryTree {
    public static List<Integer> topView(TreeNode root) {
        if (root == null) return Collections.emptyList();

        // Map hd -> first node value at that hd; TreeMap to get sorted order by hd
        TreeMap<Integer, Integer> map = new TreeMap<>();
        // Queue of pairs (node, hd)
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair p = q.poll();
            TreeNode node = p.node;
            int hd = p.hd;

            // If hd not seen before, this is the topmost node for this hd
            if (!map.containsKey(hd)) {
                map.put(hd, node.val);
            }

            if (node.left != null) q.add(new Pair(node.left, hd - 1));
            if (node.right != null) q.add(new Pair(node.right, hd + 1));
        }

        // Collect result in order of hd (left to right)
        List<Integer> result = new ArrayList<>();
        for (int val : map.values()) result.add(val);
        return result;
    }

    // small helper pair class
    static class Pair {
        TreeNode node;
        int hd;
        Pair(TreeNode n, int h) { node = n; hd = h; }
    }

    // Example
    
                 1
               /   \
              2     3
               \   / \
                4 5   6

           Top view: 2 1 3 6
      
}
