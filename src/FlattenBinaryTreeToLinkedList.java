/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class FlattenBinaryTreeToLinkedList{
    public void flatten(TreeNode root) {
        if(root == null)
          return;
        ArrayList<TreeNode> pre = new ArrayList<TreeNode>();
        pre.add(null);
        helper(root.pre);
    }
    private void helper(TreeNode root, ArrayList<TreeNode> pre){
        if(root == null)
          return;
        TreeNode right = root.right;
        if(pre != null){
          pre.get(0).left = null;
          pre.get(0).right = root;
           
        }
        pre.set(0,root);
        helper(root.left,pre);
        helper(right,pre);
    }
}