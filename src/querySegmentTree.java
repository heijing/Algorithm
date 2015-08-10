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
public class querySegmentTree{
    /**
     *@param root, start, end: The root of segment tree and 
     *                         an segment / interval
     *@return: The maximum number in the interval [start, end]
     */
    public int query(SegmentTreeNode root, int start, int end) {
        if(root == null)
           return 0;
        // write your code here
        if(start == root.start && root.end == end) { // 相等 
            return root.max;
        }
        int mid = (root.start+root.end)/2;
        int leftmax = Integer.MIN_VALUE;
        int rightmax = Integer.MIN_VALUE;
        if(mid>=start){//左边
            if(end>mid){
                leftmax = query(root.left,start,mid);
                //rightmax = query(root.right,mid+1,end);
            }
            else{
                leftmax = query(root.left,start,end);
                //rightmax = leftmax;
            }
        }
        if(mid<end){//右边
            if(start>=mid){
                rightmax = query(root.right,start,end);
            }
            else{
                rightmax = query(root.right,mid+1,end);
            }
            
        }
        return Math.max(leftmax,rightmax);
    }
}
