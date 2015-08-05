public class bestToBuyI {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices == null)
          return 0;
        //keep track of min price
        int min = Integer.MAX_VALUE;
        int max = 0;
        int dif = 0;
        for(int i= 0;i<prices.length;i++){
            if(prices[i] < min){
               min = prices[i];
            }
            dif = prices[i] - min;
            if(dif > max){
                max = dif;
            }
            
        }
          return max;
        
    }
}