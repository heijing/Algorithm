public class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0 || matrix == null)
           return 0;
        int max = 0;
        int[][] tmp = new int[matrix.length][matrix[0].length];
        for(int i = 0;i<matrix[0].length;i++){
            tmp[0][i] = Character.getNumericValue(matrix[0][i]);
        }
        for(int j = 0 ;j<matrix.length;j++){
            tmp[j][0] = Character.getNumericValue(matrix[j][0]);
        }
        for(int i = 1;i<matrix.length;i++){
            for(int j = 1;j<matrix[0].length;j++){
                if(matrix[i][j] == '1'){
                    int min = Math.min(tmp[i-1][j],tmp[i][j-1]);
                    min = Math.min(min,tmp[i-1][j-1]);
                    tmp[i][j] = min+1;
                }
                else{
                    tmp[i][j] = 0;
                }
                max = Math.max(max,tmp[i][j]);
            }
        }
        for (int i = 0; i <matrix.length ; i++) {
		  for (int j = 0; j < matrix[0].length; j++) {
			if (tmp[i][j] > max) {
				max = tmp[i][j];
			}
		}
	}
        
        return max*max;
    }
}