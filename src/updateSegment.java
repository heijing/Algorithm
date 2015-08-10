/**
 * Definition of SegmentTreeNode:
 * public class SegmentTreeNode {
 *     public int start, end, max;
 *     public SegmentTreeNode left, right;
 *     public SegmentTreeNode(int start, int end, int max) {
 *         this.start = start;
 *         this.end = end;
 *         this.max = max
 *         this.left = this.right = null;
 *     }
 * }
 */
public class updateSegment {
    /**
     *@param root, index, value: The root of segment tree and 
     *@ change the node's value with [index, index] to the new given value
     *@return: void
     */
    public void modify(SegmentTreeNode root, int index, int value) {
        // write your code here
        //query,update
        if(root == null)
          return;
        if(root.start == index && root.end == index){
            root.max = value;
            return;
        }
        int mid = (root.start+root.end)/2;
        if(root.start<=index && index <=mid){
            modify(root.left,index,value);
        }
        if(index>mid && index <= root.end){
            modify(root.right,index,value);
        }
        root.max = Math.max(root.left.max,root.right.max);
    }
}
