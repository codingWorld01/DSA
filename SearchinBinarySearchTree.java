// import javax.swing.tree.TreeNode;

//  Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class SearchinBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {

        while (root != null) {
            if (root.val == val)
                return root;

            if (root.val > val) {
                root = root.left;
                continue;
            }
            if (root.val < val) {
                root = root.right;
                continue;
            }

        }

        return null;
    }
}
