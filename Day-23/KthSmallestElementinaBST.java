class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class KthSmallestElementinaBST {
    private int count = 0;
    private int result = 0;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return result;
    }

    private void inorder(TreeNode node, int k) {
        if (node == null) {
            return;
        }

        inorder(node.left, k);

        count++;

        if (count == k) {
            result = node.val;
            return;
        }

        inorder(node.right, k);
    }
    public static void main(String[] args) {
        KthSmallestElementinaBST finder = new KthSmallestElementinaBST();

        // Example usage:
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        int k = 1;
        int kthSmallest = finder.kthSmallest(root, k);
        System.out.println("The " + k + "th smallest element in the BST is: " + kthSmallest); // Output: 1
    }
}
