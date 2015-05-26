public class threeSumClosest {
    public int threeSumClosest(int[] num, int target) {
        if(num == null || num.length<=2)
          return Integer.MIN_VALUE;
         Arrays.sort(num);
        int closest = num[0]+num[1]+num[2]-target;
        for(int i=0;i<num.length-2;i++){
            int dif = twoSum(num,target-num[i],i+1);
            if(Math.abs(dif) < Math.abs(closest))
                closest = dif;
        }
      return target+closest;  
    }
    private int twoSum(int[] num,int target,int start){
        int closest =num[start]+num[start+1]-target;
        int l = start;
        int r = num.length -1;
        while(l<r){
            if(num[l]+num[r] == target)
            return 0;
            int dif = num[l]+num[r]-target;
            if(Math.abs(dif) < Math.abs(closest)){
                closest = dif;
            }
            if(num[l]+num[r]>target){
                r--;
            }
            else{
                l++;
            }
        }
        return closest;
    }
}