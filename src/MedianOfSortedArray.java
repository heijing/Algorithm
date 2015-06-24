public class MedianOfSortedArray{
	public double findMedianSortedArray(int A[],int []B){
	  int m = A.length;
	  int n = B.length;
	  if(m < n){
	  	return findMedianSortedArray(B,A);
	  }
	  int iMin = 0;
	  int iMax = m;
	  while(iMin<iMax){
	  	int i = (iMin+iMax)/2;
	  	int j = (iMin+iMax)/2-i;
	  	if(i >0 && j<n && A[i-1]>B[j]){
	  		iMax = i-1;
	  	}
	  	else if (j>0 && i<m && B[j-1]>A[i]) {
	  		iMin = i+1;
	  		
	  	}
	  	else{
	  		int num1 = 0;
	  		int num2 = 0;
	  	    if(i == 0){
	  	    	num1 = B[j-1];
	  	    }
	  	    else if(j == 0){
	  	    	num1 = A[i-1];
	  	    }
	  	    else{
	  	    	num1 = Math.min(A[i-1],B[j-1]);
	  	    }
	  	    if((m+n)&1)==1){
                return num1;
            }
	  	    if(i == m){
	  	    	num2 = B[j];
	  	    }
	  	    else if(j == n){
	  	    	num1 = A[i];
	  	    }
	  	    else {
	  	    	num2 = Math.min(A[i],B[j]);
	  	    }
            return (num2+num1)/2;
	  	}
	  }
	     return -1;
	}
}