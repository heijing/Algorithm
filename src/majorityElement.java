public class majorityElement{
    public int majorityElement(int[] nums) {
        if(nums.length == 0 || nums == null)
            return 0;
        int count = 0;
        int res = 0;
        for(int i = 0;i<nums.length;i++){
            if(count == 0){
                res = nums[i];
                count++;
            }
            else if(res == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return res;
    }
}