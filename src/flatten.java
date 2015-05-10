public class flatten {
    public void flatten(TreeNode root) {
        if(root == null)
          return;
        ArrayList<TreeNode> pre = new ArrayList<TreeNode>();
        pre.add(null);
        helper(root,pre);
        
    }
    public void helper(TreeNode root, ArrayList<TreeNode> pre){
        if(root == null)
          return;
        TreeNode right = root.right;
        if(pre.get(0) != null){
            pre.get(0).left = null;
            pre.get(0).right = root;
            
        }
        pre.set(0,root);
        helper(root.left,pre);
        helper(right,pre);
        
    } 
}