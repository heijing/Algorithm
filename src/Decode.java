public class countAndSay{
	public String countAndSay(int n) {
        if(n == 0)
        return "";
        String res = "1";
        int count = 1;
        for(int i=1;i<n;i++){
            StringBuilder item = new StringBuilder();
            for(int j=0;j<res.length();j++){
                if(j + 1 == res.length() || res.charAt(j+1) != res.charAt(j)){
                    item.append(count);
                    item.append(res.charAt(j));
                    count = 1;
                }
                else{
                    count++;
                }
                
            }
            res = item.toString();
        }
        return res;
    }
}