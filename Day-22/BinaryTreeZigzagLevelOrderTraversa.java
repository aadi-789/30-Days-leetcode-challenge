import java.util.*;



class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BinaryTreeZigzagLevelOrderTraversa {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();

                if (leftToRight) {
                    level.add(current.val);
                } else {
                    level.add(0, current.val);
                }

                if (current.left != null) {
                    queue.offer(current.left);
                }

                if (current.right != null) {
                    queue.offer(current.right);
                }
            }

            result.add(level);
            leftToRight = !leftToRight;
        }

        return result;
    }
    public static void main(String[] args) {
        BinaryTreeZigzagLevelOrderTraversa traversal = new BinaryTreeZigzagLevelOrderTraversa();

        // Create a sample binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = traversal.zigzagLevelOrder(root);

        // Print the result
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}
