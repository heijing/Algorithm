public class Solution {
    /**
     * @param A, B: Two strings.
     * @return: The length of longest common subsequence of A and B.
     */
    public int longestCommonSubsequence(String A, String B) {
        // write your code here
        if(A == null || B == null || A.length()== 0 || B.length()==0)
          return 0;
        int res[][] = new int[A.length()+2][B.length()+2];
        for(int i = 0;i<A.length();i++){
            for(int j = 0;j<B.length();j++){
                if(A.charAt(i) == B.charAt(j)){
                    res[i+1][j+1] = res[i][j]+1;
                }
                else{
                    res[i+1][j+1] = Math.max(res[i+1][j],res[i][j+1]);
                }
            }
        }
        return res[A.length()][B.length()];
    }
}
