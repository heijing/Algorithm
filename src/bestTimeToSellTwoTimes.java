public class bestTimeToSellTwoTimes {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices == null)
          return 0;
        int local []  = new int[3];//do several times transections, the local best,
        int global [] = new int[3];//do several times transections,the globle best
         for(int i = 0;i<prices.length-1;i++){
             int gap = prices[i+1]-prices[i];
           for(int j = 2;j>=1;j--){
                local[j] = Math.max(global[j-1]+Math.max(0,gap),local[j]+gap);// use the j-1 transection,and buy last two day, sell last day; sell last two day is same with sell last day (i-1)-(i-2)+i-(i-1)
                //local[j] = Math.max(global[j-1]+(gap>0?gap:0), local[j]+gap);  
                global[j] = Math.max(local[j],global[j]);
            }
        }
            
        
        return global[2];
        
    }
}