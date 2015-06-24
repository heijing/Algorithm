/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class rightSideView{
	public List<Integer> rightSideView(TreeNode root){
	  List<Integer> res = new ArrayList<Integer>();
	  if(root == null)
	    return res;
	  LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
	  queue.add(root);
	  while(!queue.isEmpty()){
	  	int numOfCurLevel = queue.size();
	  	for(int i = 0;i<numOfCurLevel;i++){
	  		TreeNode x = queue.pop();
	  		if(i == 0){
	  			res.add(x.val);
	  		}
	  		if(x.right!= null){
	  			queue.add(x.right);
	  		}
	  		if(x.left != null){
	  			queue.add(x.left);
	  		}
	  	}
	  }  
	    return res;
	}
}