public class countSmallerOne {
   /**
     * @param A: An integer array
     * @return: The number of element in the array that 
     *          are smaller that the given integer
     */
    public ArrayList<Integer> countOfSmallerNumber(int[] A, int[] queries) {
        // write your code here
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0;i<queries.length;i++){
            int count = 0 ;
            for(int j = 0;j<A.length;j++){
                if(A[j]<queries[i]){
                    count++;
                }
            }
            res.add(count);
        }
        return res;
        
    }
}