public class Solution {
    /**
     * @param A: A list of lists of integers
     * @return: An integer
     */
    public int jump(int[] A) {
        // write your code here
        if(A.length == 0 || A == null)
         return 0;
        int step [] = new int[A.length];
        step[0] = 0;
        for(int i = 1;i<A.length;i++){
            for(int j = 0;j< i ;j++){
               if(i-j<=A[j]){
                   step[i] = step[j]+1;
                   break;
               } 
            }
        }
        return step[A.length-1];
    }
}
