public class preOrder{
	public LinkedList<TreeNode> preorder(TreeNode root){
	   LinkedList<TreeNode> res = new LinkedList<TreeNode>();
	   if(root == null )
	     return res;
	   helper(root,res);
	   return res;


	}
	public void helper(TreeNode root,LinkedList<TreeNode> res){
	   if(root == null){
           return;
	   }
	   res.add(root);
	   helper(root.left,res);
	   helper(root.right,res);
	}
}