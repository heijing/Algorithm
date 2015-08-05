public class productExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 0 || nums == null)
          return nums;
        int [] res = new int[nums.length];
        res[0] = 1;
        for(int i = 1;i<nums.length;i++){
            res[i] = res[i-1]*nums[i-1];
        }
        int right = 1;
        for(int i = nums.length-1;i>=0;i--){
            res[i] *= right;
            right*=nums[i];
        
        }
            
        return res;
    }
}