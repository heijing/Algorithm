public class largestRectangleHistogram {
    public int largestRectangleArea(int[] height) {
        if(height.length == 0 || height == null)
          return 0;
        LinkedList<Integer> stack = new LinkedList<Integer>();// to keep a ascending stack
        int max = 0;
        for(int i = 0;i<height.length;i++){
            while(!stack.isEmpty() && height[i]< height[stack.peek()]){
                int index = stack.pop();
                int area = stack.isEmpty()?i*height[index]:(i-stack.peek()-1)*height[index];
                max = Math.max(max,area);
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int index = stack.pop();
            int area =  stack.isEmpty()?(height.length*height[index]):(height.length-stack.peek()-1)*height[index];
            max = Math.max(max,area);
        }
        
        return max;
    }
}