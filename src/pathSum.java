/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class pathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
          return false;
        if(root.left == null && root.right == null && root.val == sum)//leaves  
          return true;
        return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
        
    }
}