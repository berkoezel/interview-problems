// 101 -- Symmetric Tree

class Solution {
    private boolean foo(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        
        else if(left == null || right == null) return false;
        
        else if(left.val != right.val) return false;
        
        return foo(left.left, right.right) && foo(left.right, right.left);
    
    }
    
    public boolean isSymmetric(TreeNode root) {
        return foo(root.left, root.right);
    }
    
}
