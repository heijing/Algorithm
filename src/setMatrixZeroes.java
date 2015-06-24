public class setMatrixZeroes{
	public void setZeroes(int[][] matrix){
	   if(matrix.length == 0 || matrix == null)
	       return;
	   boolean colflag = false;
	   boolean rowflag = false;
	   for(int i = 0;i<matrix.length;i++){
	   	 if(matrix[0][i] == 0)
	   	 	colflag = true;
	   }
	   for(int j = 0;j<matrix[0].length;j++){
	   	if(matrix[j][0] == 0)
	   		rowflag = true;
	   }
	   for(int i = 1;i<matrix.length;i++){
	   	for(int j = 1;j<matrix[0].length;j++){
	   		if(matrix[i][j] == 0){
	   			matrix[i][0] = 0;
	   			matrix[0][j] = 0;
	   		}
	   	}
	   }
	   for(int i = 1;i<matrix.length;i++){
	   	for(int j = 1;j<matrix[0].length;j++){
	   		if(matrix[i][0] == 0 || matrix[0][j] == 0)
	   			matrix[i][j] = 0;
	   	}

	}
	if(colflag){
		for(int i = 0;i<matrix.length;i++){
			matrix[i][0] = 0;
		}
	}
	if(rowflag){
		for(int j = 0;j<matrix[0].length;j++){
			matrix[0][j] = 0;
		}
	}
}
}