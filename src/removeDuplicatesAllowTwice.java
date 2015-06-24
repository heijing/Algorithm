public class removeDuplicatesAllowTwice{
	public int removeDuplicate(inr[] A){
	  if(A.length == 0 || A == null)
	    return 0;
	  int index = 1;
	  int count = 1;
	  for(int i = 1;i<A.length;i++){
	    if(A[i] == A[i-1]){
	     count++;
	     if(count >=3)
	       continue;
	    }
	    else{
	      count = 1;
	    }
	     A[index++] = A[i];
	  }
	  return index;
	}
}