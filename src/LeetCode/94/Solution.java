// 94 -- Binary Tree Inorder Traversal

class Solution {
    List<Integer> ret = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return ret;
        if(root.left != null) inorderTraversal(root.left);
        ret.add(root.val);
        if(root.right != null) inorderTraversal(root.right);
        return ret;
    }
}
