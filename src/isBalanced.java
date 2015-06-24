public class isBalanced{
	public boolean isBalanced(TreeNode root){
	   return maxDepth(root) != -1;
	}
    public int maxDepth(TreeNode root){
       if(root == null)
         return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if(left < 0 || right < 0)
          return -1;
        if(Math.abs(left-right)>1)
          return -1;
        return Math.max(left,right)+1;
    }
}