public class recoverRotatedSortedArray{
    /**
     * @param nums: The rotated sorted array
     * @return: void
     */
    public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
        // write your code
        for (int i = 1; i<nums.size();i++){
            if(nums.get(i) < nums.get(i-1)){
                reverse(nums,0,i-1);
                reverse(nums,i,nums.size()-1);
                reverse(nums,0,nums.size()-1);
                break;
            }
        }
    }
    public void reverse(ArrayList<Integer> nums,int start ,int end){
        int temp;
        while(start <end){
            temp = nums.get(start);
            nums.set(start,nums.get(end));
            nums.set(end,temp);
            start++;
            end--;
        }
        
    }
}