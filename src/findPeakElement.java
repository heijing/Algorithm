 public class findPeakElement{
    public int findPeakElement(int[] nums) {
        if(nums.length == 0 || nums == null)
          return 0;
        int res = nums[0];
        int index = 0;
        for(int i = 1;i<nums.length-1;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1] && nums[i]>res){
                index = i;
                res = nums[i];
            }
            
        }
        if(nums[nums.length-1]>res){
            res = nums[nums.length-1];
            index = nums.length-1;
        }
         
         return index;
    }
}