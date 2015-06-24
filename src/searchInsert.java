public class searchInsert {
    public int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0)
         return -1;
         int n = nums.length;
         int l = 0;
         int r = n-1;
         while(l<=r){
             int mid = (l+r)/2;
             if(target == nums[mid]){
                 return mid;
             }else if(target > nums[mid]){
                 l = mid+1;
             }
             else if(target < nums[mid]){
                 r = mid -1;
             }
             
         }
         return l;

    }
}