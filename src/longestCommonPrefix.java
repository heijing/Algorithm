public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if(strs.length == 0 || strs == null)
           return sb.toString();
        int index = 0;
        boolean flag = true;
        while(flag){
            for(int i = 0; i<strs.length;i++){
                if(strs[i].length() <=index || strs[i].charAt(index) != strs[0].charAt(index)){
                    flag = false;
                    break;
                }
            }
                if(flag)
                    sb.append(strs[0].charAt(index));
                index++;
               
            }
         return sb.toString();
       
    }
}