import java.util.List;
import java.util.ArrayList;

//  * Definition for a binary tree node.
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

public class PreorderTraversal {

    public List<Integer> list = new ArrayList<Integer>();

    public List<Integer> preorderTraversal(TreeNode root) {

        if (root == null)
            return list;

        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return list;
    }
}