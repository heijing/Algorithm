public class Solution {
    public int TrapRainWater(int[] height) {
        if(height == null || height.length == 0)
          return 0;
        int max = height[0];
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int res = 0;
        left[0] = height[0];
        for(int i = 1;i<height.length;i++){
            left[i] = Math.max(max,height[i]);
            max = Math.max(max,height[i]);
        }
        right[height.length-1] = height[height.length-1];
        max = height[height.length-1];
        for(int i = height.length-2;i>0;i--){
            right[i] = Math.max(height[i],max);
            max = Math.max(max,height[i]);
         }
        for(int i =1 ;i<height.length;i++){
            int bit = Math.min(left[i],right[i])-height[i];
            if(bit>0){
                res+= bit;
            }
        }
       return res; 
    }
}