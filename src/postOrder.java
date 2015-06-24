/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class postOrder{
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null)
          return res;
        LinkedList<TreeNode> stack1 = new LinkedList<TreeNode>();
        LinkedList<TreeNode> newStack = new LinkedList<TreeNode>();
        stack1.push(root);
        while(!stack1.isEmpty()){
            TreeNode cur = stack1.pop();
            newStack.push(cur);
            if(cur.left != null){
                stack1.push(cur.left);
            }
            if(cur.right != null){
                stack1.push(cur.right);
            }
        }
        while(!newStack.isEmpty()){
            res.add(newStack.pop().val);
        }
        return res;
    }
}