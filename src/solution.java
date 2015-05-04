
public class solution {
	void insertSort(int[] a){
	for(int i=1;i<a.length;i++){
		int j;
		int tmp = a[i];
		for( j =i;j>=0&&tmp.compareTo(a[j-1]<0);j--){
			a[j] = a[j-1];
		}
		a[j] =tmp;
	}
	
	}
}
