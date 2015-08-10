public class countSmallerBinary{
   /**
     * @param A: An integer array
     * @return: The number of element in the array that 
     *          are smaller that the given integer
     */
    public ArrayList<Integer> countOfSmallerNumber(int[] A, int[] queries) {
        // write your code here
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(A);
        for(int i = 0;i<queries.length;i++){
            int index = binarySearch(A,queries[i]);
            res.add(index);
        }
        return res;
    }
    public int binarySearch(int[] A,int target){
        if(A.length == 0 || A == null)
          return 0;
        int left = 0;
        int right = A.length-1;
        int res = 0;
        while(left<=right){
            int mid = (left+right)/2;
            if(A[mid] >= target){
                right = mid-1;
            }
            else {
                left = mid+1;
                res = mid+1;
                
            }
        }
        return res;
    }
}

