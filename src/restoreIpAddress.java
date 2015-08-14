public class restoreIpAddress{
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        if(s.length() == 0 || s == null)
          return res;
        List<String> item = new ArrayList<>();
        helper(res,item,0,s);
        return res;
    }
    public void helper(List<String> res,List<String> item, int index,String s){
        if(item.size() == 4){
            if(index == s.length()){
                StringBuilder ipp = new StringBuilder();
                for(String piece:item){
                    ipp.append(piece).append(".");
                }
                res.add(ipp.substring(0,ipp.length()-1));
            }
            return;
        }
        for(int i = index;i<s.length() && i<index+3;i++){
            String sub = s.substring(index,i+1);
            if(isValid(sub)){
                item.add(sub);
                helper(res,item,i+1,s);
               item.remove(item.size()-1);
            }
            
        }
        
    }
    public boolean isValid(String s){
        if(s.length() > 1 && s.charAt(0) == '0')
          return false;
        int code = Integer.parseInt(s);
        return code>=0 && code <=255;
    }
    
}