public class summaryRange{
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if(nums.length == 0 || nums == null)
          return res;
        for(int i = 0;i<nums.length;i++){
            int a = i;
            while(i+1<nums.length && nums[i+1] - nums[i]==1){
                i++;
            }
            if(a != i){
                res.add(nums[a]+"->"+nums[i]);
            }
            else{
                res.add(nums[a]+"");
            }
        }
         return res;
    }
}