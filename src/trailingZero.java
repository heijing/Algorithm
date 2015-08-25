public class trailingZero {
    public int trailingZeroes(int n) {
        if(n < 0)
          return -1;
         int count = 0;
        for(long i = 5;i<=n;i = i*5 ){
            count+=n/i;
        }
        return count;
    }
    
}