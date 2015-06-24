public class BSTIterator{
	Stack<TreeNode> stack = new Stack<TreeNode>();
	public BSTIterator(TreeNode root){
	   TreeNode cur = root;
	   while(cur!= null){
	     stack.push(cur);
	     cur = cur.left;//push all left node
	   }
	}
	public boolean hasNext(){

	}
	public int next(){
		TreeNode cur = stack.pop();
		int res = cur.val;
		cur = cur.right;
		while(cur != null){
			stack.push(cur);
			cur = cur.left;
		}
		  return res;
	}
}