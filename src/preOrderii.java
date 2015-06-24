public class preOrderii{
	public LinkedList<TreeNode> preorder(TreeNode root){
	   LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
	   ArrayList<Integer> res = new ArrayList<Integer>();
	   if(root == null)
	     return res;
	  
	   while(root != null ||!stack.isEmpty()){
	       if(root != null){
	          stack.push(root);
	          res.add(root.val);
	          root = root.left;
	       }
	       else{
	         root = stack.pop();
	          root = root.right;
	       }
	   }
	     return res;

	}
}