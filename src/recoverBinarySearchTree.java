public class recoverBinarySearchTree{
	public void recoverBinarySearchTree(TreeNode root){
	  if(root == null)
	  	return;
	  ArrayList<Integer> pre = nre ArrayList<>();
	  pre.add(null);
	  ArrayList<Integer> res = new ArrayList<>();
	  helper(root,res,pre);
	  if(res.size() >0){
	  	int temp = res.get(0);
	  	res.get(0) = res.get(1);
	  	res.get(1) = temp;
	  }

	}
	privave void helper(TreeNode root, ArrayList<Integer> res,ArrayList<Integer> pre){
		if(root == null)
			return;
		helper(root.left,res,pre);
		if(pre != null && pre.get(0) > root.val){
			if(res == null){
				res.add(pre.get(0));
				res.add(root.val);
			}
			else{
				res.set(1,root.val);
			}
		}
		pre.set(0,root.val);
		helper(root.right,res,pre);
	}
}