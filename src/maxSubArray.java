public class sortColor{
	public void sortColor(int[] A){
		if(A.length == 0 || A == null)
			return;
		int[] count = new int[3];
		int [] res = new int[n];
		for(int i = 0;i<A.length;i++){
			count[A[i]]:
		}
		for(int i = 1;i<3;i++){
			count[i] = count[i-1]+count[i];
		}
		for(int i = A.length;i >=0;i--){
			res[--count[A[i]]] = A[i];
		}
		for(int i = 0;i<A.length;i++){
			A[i] = res[i];
		}
	}
}
