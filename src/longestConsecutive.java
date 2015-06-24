public class longestConsecutive
 {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0)
           return 0;
        HashSet<Integer> set = new HashSet<Integer>();
        int res = 1;
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        while(!set.isEmpty()){
            Iterator it = set.iterator();
            int item  = (Integer)it.next();
            set.remove(item);
            int next = item +1;
            int len = 1;
            while(set.contains(next)){
                len++;
                set.remove(next++);
            }
            int i = item-1;
            while(set.contains(i)){
                len++;
                set.remove(i--);
            }
            if(len >res){
                res = len;
            }
            
        }
           return res;
        }
        
    }