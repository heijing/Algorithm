public class levelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if(root == null)
          return res;
       LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
       int level = 0;
       int lastNum = 1;
       int curNum = 0;
       queue.offer(root);
       while(!queue.isEmpty()){
           TreeNode n = queue.poll();
           lastNum--;
           if(res.size()<=level)
               res.add(new LinkedList<Integer>());
           res.get(level).add(n.val);
           if(n.left != null){
               queue.add(n.left);
               curNum++;
           }
           if(n.right != null){
               queue.add(n.right);
               curNum++;
           }
           if(lastNum == 0){
               level++;
               lastNum = curNum;
               curNum = 0;
           }
           
       }
       Collections.reverse(res);
       return res;
        
    }
}