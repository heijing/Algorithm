public class minSubArrayLen {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length == 0 || nums == null)
             return 0;
        int first = 0;
        int second = 0;
        int min = nums.length;
        int sum = nums[0];
        while(first<nums.length && second<=first){
            if(sum<s){
                first++;
                if(first<nums.length)
                sum+=nums[first];
            }else{
                min = Math.min(min,first-second+1);
                sum-=nums[second];
                second++;
            }
        }
        if(min == nums.length)
        return 0;
        return min;
    }
}