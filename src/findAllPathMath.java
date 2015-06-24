public class findAllPathMath{
	public ArrayList<ArrayList<Integer>> pathSum(TreeNode root,int sum){
	  ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
	  if(root == null)
	    return res;
	  ArrayList<Integer> item=new ArrayList<Integer>();
	  item.add(root.val);
	  helper(root,sum-root.val,res,item);
	  return res;
	}
	private void helper(TreeNode root,int sum,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> item){
	  if(root == null)
	    return;
	  if(root.left == null && root.right == null && sum == 0){
	    res.add(item);
	    return;
	  }
	  if(root.left != null){
	     item.add(root.left.val);
	     helper(root.left,sum-root.left.val,res,item);
	     item.remove(item.size()-1);
	  }
	   if(root.right != null){
	     item.add(root.right.val);
	     helper(root.left,sum-root.right.val,res,item);
	     item.remove(item.size()-1);
	  }
	}
}