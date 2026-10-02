/**
 * ValidateBinarySearchTree
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class ValidateBinarySearchTree {
     public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode node, long min, long max) {
        if (node == null) {
            return true;
        }

        if (node.val <= min || node.val >= max) {
            return false;
        }

        return validate(node.left, min, node.val) &&
               validate(node.right, node.val, max);
    }
    public static void main(String[] args) {
        ValidateBinarySearchTree validator = new ValidateBinarySearchTree();

        // Example usage:
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        boolean isValid = validator.isValidBST(root);
        System.out.println("Is the tree a valid BST? " + isValid); // Output: true
    }
    
}