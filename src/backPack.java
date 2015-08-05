public class backPack {
    /**
     * @param m: An integer m denotes the size of a backpack
     * @param A: Given n items with size A[i]
     * @return: The maximum size
     */
    public int backPack(int m, int[] A) {
        // write your code here
        if(m == 0 || A.length == 0 || A == null)
          return 0;
        boolean res[][] = new boolean[A.length+1][m+1];
        for(int i = 0;i<= A.length;i++){
            for(int j = 0;j<=m;j++){
                res[i][j] = false;
            }
        }
        res[0][0] = true;
        for(int i = 0;i< A.length;i++){
            for(int j = 0;j<=m;j++){
                res[i+1][j] = res[i][j];
                if(j>=A[i] && res[i][j-A[i]])
                res[i+1][j] = true;
            }
        }
        for(int j = m;j>0;j--){
            if(res[A.length][j]){
                return j;
            }
        }
        return 0;
    }
}