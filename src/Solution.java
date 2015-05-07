public class Solution {
    public int evalRPN(String[] tokens) {
        int res = 0;
        if(tokens.length == 0 || tokens == null)
           return 0;
        LinkedList<Integer> stack = new LinkedList<Integer>(); 
        for(int i = 0; i<tokens.length;i++){
            if(tokens[i].equals("+") ){
                stack.push(stack.pop()+stack.pop());
            }
            else if(tokens[i].equals("-")){
                stack.push(-stack.pop()+stack.pop());
            }
            else if(tokens[i].equals("*")){
                stack.push(stack.pop()*stack.pop());
            }
            else if(tokens[i].equals("/")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2/num1);
            }
            else{
               stack.push(Integer.parseInt(tokens[i]));  
            }
        }
           return stack.pop();
        
    }
}