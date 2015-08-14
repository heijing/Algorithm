/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class pathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
          return res;
        List<Integer> item = new ArrayList<>();
        item.add(root.val);
        helper(root,res,item,sum-root.val);
        return res;
    }
    public void helper(TreeNode root,List<List<Integer>> res, List<Integer> item,int sum){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null && sum == 0){
            res.add(new ArrayList<>(item));
            return;
        }
        if(root.left != null){
            item.add(root.left.val);
            helper(root.left,res,item,sum-root.left.val);
            item.remove(item.size()-1);
        }
        if(root.right != null){
            item.add(root.right.val);
            helper(root.right,res,item,sum-root.right.val);
            item.remove(item.size()-1);
        }
        }
            
    }
