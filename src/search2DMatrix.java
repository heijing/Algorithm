public search2DMatrix{
	public boolean search2DMatrix(int [][] matrix,int target){
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return false;
		int m = matrix.length;
		int n = matrix[0].length;
		int l = 0;
		int r = n-1;
		while(l <m && r >= 0){
			if(matrix[l][r] == target){
				return true;
			}
			else if(matrix[l][r] < target){
                    l++;
			}
			else{
				  r--;
			}
		}
		  return false;
	}
}