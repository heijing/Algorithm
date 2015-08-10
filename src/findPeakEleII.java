class findPeakEleII{
    /**
     * @param A: An integer matrix
     * @return: The index of the peak
     */
    public List<Integer> findPeakII(int[][] A) {
        // write your code here
        List<Integer> res = new ArrayList<>();
        if(A.length == 0 || A == null)
          return res;
        int i = 1;
        int j = 1;
        while(true){
            if(isValid(A,i,j)){
            res.add(i);
            res.add(j);
            return res;
        }
        else {
            if(A[i+1][j]>A[i][j+1]){
               i++;
            }
            else{
                j++;
            }
            
          }
        }
        
          
    }
    public boolean isValid(int[][] A,int i,int j){
        if(i>0 && A[i][j]>A[i-1][j] && i<A.length-1 && A[i][j]>A[i+1][j]&& j>0 && A[i][j]>A[i][j-1] && j<A[0].length-1 && A[i][j]>A[i][j+1])
            return true;
        return false;
    }
}

