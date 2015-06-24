/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 */



public class levelOrderSolution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> item = new ArrayList<>();
        if(root == null)
          return res;
        int curNum = 1;
        int nextNum = 0;
        
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode x = queue.poll();
            item.add(x.val);
            curNum --;
            if(x.left != null){
                queue.add(x.left);
                nextNum++;
            }
            if(x.right != null){
                queue.add(x.right);
                nextNum++;
            }
            if(curNum == 0){
                curNum = nextNum;
                nextNum = 0;
                res.add(item);
                item = new ArrayList<Integer>();
            }
            
            
        }
         return res;
        
    }
}