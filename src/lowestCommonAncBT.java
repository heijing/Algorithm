public class lowestCommonAncBT {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == null || q == null)
          return null;
        if(root == p || root == q){
            return root;
        }
        TreeNode l = lowestCommonAncestor(root.left,p,q);
        TreeNode r = lowestCommonAncestor(root.right,p,q);
        if(l != null && r != null)
          return root;
        return l == null?r:l;
        
    }
}