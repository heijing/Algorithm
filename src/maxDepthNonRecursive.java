public class maxDepthNonRecursive{ // can compute how many nodes
	public int maxDepth(TreeNode root){//BFS
	   if(root == null)
	   	  return 0;
	   	LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
	   	int curNum = 1;
	   	int neXtNum = 0;
	   	int level = 0;
	   	queue.add(root);
	   	while(!add.isEmpty()){
	   		TreeNode n = queue.poll);
            curNum--;
            if(n.left ! = null){
            	queue.add(n.left);
            	nextNum++;
            }
            if(n.right != null){
            	queue.add(n.right);
            	neXtNum++;
            }
            if(curNum == 0){
            	curNum = neXtNum;
            	nextNum = 0;
            	level++;
            }

	   	}
	   	 return level;
	}
}