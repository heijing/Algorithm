public class longestIncreasingSubsequence{
    /**
     * @param nums: The integer array
     * @return: The length of LIS (longest increasing subsequence)
     */
    public int longestIncreasingSubsequence(int[] nums) {
        // write your code here
        if(nums.length == 0)
        return 0;
        int max = 0;
        int res [] = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            res[i] = 1;
        }
        for(int i = 0;i<nums.length;i++){
            //res[i] = 1;
            for(int j = 0;j<i;j++){
                if(nums[i]>=nums[j]){
                res[i] = Math.max(res[i],res[j]+1);
                }
            }
            if(res[i] >max){
                max = res[i];
            }
        }
        return max;
    }
}