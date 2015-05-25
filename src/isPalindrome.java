public class isPalindrome {
    public boolean isPalindrome(String s) {
        if(s.length() == 0 || s == null)
            return true;
        int start = 0;
        int end = s.length()-1;
        while(start < end){
            if(!isValid(s.charAt(start))){
                start++;
                continue;
            }
            if(!isValid(s.charAt(end))){
                end--;
                continue;
            }
            if(!isSame(s.charAt(start),s.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
        public boolean isValid(char c){
            if(c>='a'&& c<='z'||c>='A'&&c<='Z'|| c>='0'&&c<='9')
               return true;
            return false;
        }
        public boolean isSame(char a,char b){
            if(a>='A'&&a<='Z'){
                 a = (char)(a-'A'+'a');
            }
            if(b>='A'&&b<='Z'){
                 b = (char)(b-'A'+'a');
            }
            if (a!= b)
            return false;
        return true;
        }
        
}