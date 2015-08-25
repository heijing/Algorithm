public class invertedBST{
    public TreeNode invertTree(TreeNode root) {
    Queue<TreeNode> processedNodes = new LinkedList<TreeNode>();

    if(root!=null){
        processedNodes.add(root);
        while(!processedNodes.isEmpty()){
            //remove node from queue, process current node
            TreeNode current = processedNodes.remove();

            //swap nodes
            TreeNode tmp = current.left;
            current.left = current.right;
            current.right = tmp;

            if(current.left!=null){
                processedNodes.add(current.left);
            }

            if(current.right!=null){
                processedNodes.add(current.right);
            }

        }
    }
    return root;
}
}
 