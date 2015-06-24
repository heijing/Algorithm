public class searchInRotated{
	public int search(int[] A,int target){
	    if(A.length == 0 || A == null)
	      return -1;
	    int l = 0;
	    int r = A.length-1;
	    while(l<=r){
	      int m = (l+r)/2;
	      if(A[m] == target)
	       return m;
	      if(A[m]<A[r]){
	          if(target>A[m] && target<=A[r])
	            r = m+1;
	           else{
	             l = m-1;
	           }
	      }
	      else{
	         if(target<A[m] && target >=A[l]){
	            r = m-1;
	         }
	         else{
	            l = m+1;
	         }
	      }
	    }
	    return -1;
	}
}