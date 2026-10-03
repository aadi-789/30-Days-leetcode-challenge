import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
public class ConstructBinaryTreefromPreorderandInorderTraversal {
    private int preorderIndex = 0;
    private Map<Integer, Integer> inorderMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        // Store inorder value -> index for O(1) lookup
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int left, int right) {

        if (left > right) {
            return null;
        }

        // Current preorder element becomes root
        int rootValue = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootValue);

        // Find root in inorder
        int rootIndex = inorderMap.get(rootValue);

        // Elements before rootIndex belong to left subtree
        root.left = build(preorder, left, rootIndex - 1);

        // Elements after rootIndex belong to right subtree
        root.right = build(preorder, rootIndex + 1, right);

        return root;
    }
    public static void main(String[] args) {
        ConstructBinaryTreefromPreorderandInorderTraversal solution = new ConstructBinaryTreefromPreorderandInorderTraversal();
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode root = solution.buildTree(preorder, inorder);
        
    }
}
