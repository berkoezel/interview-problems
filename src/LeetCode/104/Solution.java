// 104. Maximum Depth of Binary Tree

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        else return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
