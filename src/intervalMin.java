/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */
public class intervalMin{
    /**
     *@param A, queries: Given an integer array and an query list
     *@return: The result list
     */
    class SegmentTreeNode{
        public int start;
        public int end;
        public int min;
        SegmentTreeNode left = null;
        SegmentTreeNode right = null;
        public SegmentTreeNode(int start, int end,int min){
            this.start = start;
            this.end = end;
            this.min = min;
            this.left = this.right = null;
            
        }
    }
    public ArrayList<Integer> intervalMinNumber(int[] A, 
                                                ArrayList<Interval> queries) {
        // write your code here
        SegmentTreeNode root = build(0,A.length-1,A);
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0;i< queries.size();i++){
            res.add(query(root,queries.get(i).start,queries.get(i).end));
        }
        return res;
    }
    public SegmentTreeNode build(int start,int end,int[] A){
        SegmentTreeNode root = new SegmentTreeNode(start, end, 0);
        if(start !=end){
            int mid = (start+end)/2;
            root.left = build(start,mid,A);
            root.right = build(mid+1,end,A);
            root.min = Math.min(root.left.min,root.right.min);
            
        }
        else{
            root.min = A[start];
        }
        return root;
    }
    public int query(SegmentTreeNode root,int start,int end){
        if(root == null)
          return 0;
        if(root.start == start && root.end == end)
          return root.min;
        int mid = (root.start+root.end)/2;
        int leftmin = Integer.MAX_VALUE;
        int rightmin = Integer.MAX_VALUE;
        //左边
        if(mid>=start){
            if(end<mid){
                leftmin = query(root.left,start,end);
            }
            else{
                leftmin = query(root.left,start,mid);
            }
        }
        if(mid<end){
            if(start>mid){
                rightmin = query(root.right,start,end);
            }
            else{
                rightmin = query(root.right,mid+1,end);
            }
        }
        return Math.min(leftmin,rightmin);
        
    }
    
}
