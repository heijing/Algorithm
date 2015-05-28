public class restoreIpAddress {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        if(s.length() == 0 || s == null)
           return res;
        List<String> item = new ArrayList<>();
        helper(s,0,res,item);
        return res;
    }
    private void helper(String s,int index, List<String> res, List<String> item){
        if(item.size() == 4){
            if(index == s.length()){
                StringBuilder ipAddress = new StringBuilder();
                     for(String piece : item){
                       ipAddress.append(piece).append(".");             
                     }
             res.add(ipAddress.substring(0, ipAddress.length() - 1));
            }
            return;
        }
        for(int i = index; i<index+3 &&i<s.length();i++){
            String sub = s.substring(index, i+1);
            if(isValid(sub)){
                item.add(sub);
                helper(s,i+1,res,item);
                item.remove(item.size()-1);
            }
        }
    }
    private boolean isValid(String sub){
        if(sub.length() > 1 && sub.charAt(0) == '0' )
          return false;
        int num = Integer.parseInt(sub);
        return 0<=num &&num<=255;
    }
            
}