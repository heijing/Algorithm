public class uniquePathsWithobstacle{
	public int uniquePathsWithobstacle(int[][] obstacleGrid){
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
      if(m <= 0 || n <= 0 )
        return 0;
      int [][] res =new int [m][n];
      for(int i = 0;i< m ;i++){
      	if(obstacleGrid[i][0] == 1)
      		break;
          res[i][0] = 1; 
      }
      for(int j = 0;j < n ;j++){
      	if(obstacleGrid[0][j] == 1)
      		break;
          res[0][j] = 1;
      }
      for(int i =1 ; i< m ;i++){
        for(int j = 1 ;j < n ;j++){
        	if(obstacleGrid[i][j] == 1){
        		res[i][j] = 0
        	}else{
        		res[i][j]=res[i-1][j]+res[i][j-1];
        	}
        }
      }  
      return res[m-1][n-1];
  }
}
