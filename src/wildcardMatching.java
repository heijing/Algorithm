public class Solution {
    public boolean isMatch(String s, String p) {
        int pp = 0;
        int ss = 0;
        int starIndex = -1;
        int match = 0;
        while(ss<s.length()){
            if(pp<p.length() && p.charAt(pp) == s.charAt(ss)){
                pp++;
                ss++;
                
            }
            else if(pp<p.length() && p.charAt(pp) == '?'){
                pp++;
                ss++;
            }
            else if(pp<p.length() && p.charAt(pp) == '*'){
                starIndex = pp;
                match = ss;
                pp++;
            }
            else if(starIndex != -1){
                pp = starIndex+1;
                match++;
                ss=match;
            }
            else{
                return false;
            }
        }
        while (pp < p.length() && p.charAt(pp) == '*')
            pp++;
         return pp == p.length();
    }
}