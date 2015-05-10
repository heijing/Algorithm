public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
          if(gas.length == 0 || gas == null || cost.length == 0 || cost == null)
            return -1;
           int total = 0;// all
           int sum = 0; //local
           int point = -1;
           for(int i = 0;i< gas.length;i++){
               int diff = gas[i]-cost[i];
               sum+=diff;
               total+=diff;
               if(sum<0){
                   sum = 0;
                   point = i;
               }
           }
         return total>=0?point+1:-1;
    }
}