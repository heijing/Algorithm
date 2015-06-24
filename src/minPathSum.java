public class Solution {
    /**
     * @param grid: a list of lists of integers.
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    public int minPathSum(int[][] grid) {
        // write your code here
        if(grid.length == 0 || grid == null)
          return 0;
        int res [][] = new int[grid.length][grid[0].length];
        res[0][0] = grid[0][0];
        for(int i = 1 ;i<grid[0].length;i++){
            res[0][i] = res[0][i-1]+grid[0][i];
        }
        for(int j = 1;j<grid.length;j++){
            res[j][0] = res[j-1][0]+grid[j][0];
        }
        for(int i = 1;i<grid.length;i++){
            for(int j = 1;j<grid[0].length;j++){
                res[i][j] = Math.min(res[i-1][j],res[i][j-1])+grid[i][j];
            }
        }
        return res[grid.length-1][grid[0].length-1];
    }
}
