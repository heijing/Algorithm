import java.util.Arrays;
public class MyArrayList{
	public Object[] myArray[];
	public int capacity = 0;
	public MyArrayList(){
	  myArray = new Object[10];
	}
	public Object get(int index){
	    if(index<capacity){
	        return myArray[index];
	    }
	    else{
	        throw new ArrayIndexOutOfBoundException();
	    }
	}
	public void add(Object obj){
	   if(myArray.length-capacity<=8){//load factor
	       resize();
	   }
	   myArray[index++] = obj;
	}
	public Object remove(int index){
	   if(index <capacity){
	      Object obj = myArray[index];
	      myArray[index] = null;
	      int temp = index;
	      while(temp < capacity){
	         myArray[temp] = myArray[temp+1];
	         myArray[temp+1] = null;
	         temp ++;
	      }
	      capacity --;
	      return obj;
	   }
	   else{
	       throw new ArrayIndexOutOfBoundException();

	   }
	}
	public void resize(){
		Object newArray[] = new Object[2*capacity];
		for(int i = 0;i<capacity;i++){
			newArray[i] = myArray[i];
		}
		newArray = myArray;
		capacity = capacity *2;
	}
}