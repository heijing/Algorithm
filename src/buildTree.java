/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class buildTree {
    public TreeNode buildTree(int[] preorder,int [] inorder){
	   if(preorder == null || inorder == null)
	   	  return null;
	   	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	   	for(int i = 0; i<inorder.length;i++){
	   		map.put(inorder[i],i);
	   	}
	   	 return helper(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
	}
	public TreeNode helper(int[] preorder,int preL,int preR,int[] inorder,int inL,int inR,HashMap<Integer,Integer>map){
		if(preL > preR || inL > inR){
			return null;
		}
		TreeNode root = new TreeNode(preorder[preL]);
		int position = map.get(root.val);
		root.left = helper(preorder,preL+1,position-inL+preL,inorder,inL,position-1,map);
		root.right = helper(preorder,position-inL+preL+1,preR,inorder,position+1,inR,map);
		return root;

	}
}