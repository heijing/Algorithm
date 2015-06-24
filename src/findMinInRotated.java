public findMinInRotated{
	public int findMin(int[num]){
	   if(nums.length == 0 || nums == null)
	   	  return 0;
	   	int l = 0;
	   	int r = nums.length-1;
	   	int min = num[0];
	   	while(l<r-1){
	   		int mid = (l+r)/2;
	   		if(nums[l]<nums[mid]){
	   			min = Math.min(min,nums[l]);
	   			l = mid+1;
	   		}
	   		else if(nums[l] >nums[mid]){
	   			min = Math.min(min,nums[mid]);
	   			r = mid-1;
	   		}
	   		else{
	   			l++;
	   		}
	   	}
	   	min = Math.min(nums[l],min);
	   	min = Math.min(nums[r],min);
	}
}