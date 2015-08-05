public class containsDuplicateIII {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
       if(k<1 || t< 0)
         return false;
       HashMap<Long,Long> map = new HashMap<Long,Long>();
       for(int i = 0;i<nums.length;i++){
           long remapNumber = (long)nums[i]-Integer.MIN_VALUE;
           long bucket = remapNumber/((long)t+1);
           if(map.containsKey(bucket) || map.containsKey(bucket-1) && remapNumber - map.get(bucket-1) <=t || map.containsKey(bucket+1) && map.get(bucket+1) -remapNumber <=t)
             return true;
           if(map.keySet().size() >=k){
               long lastBucket = ((long)nums[i-k]-Integer.MIN_VALUE)/((long)t+1);
               map.remove(lastBucket);
           }
           map.put(bucket,remapNumber);
       }
        return false;
    }
}