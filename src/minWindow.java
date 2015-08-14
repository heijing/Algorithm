public class minWindow {
    public String minWindow(String s, String t) {
      if(s.length() < t.length())
        return "";
      String res = "";
      HashMap<Character,Integer> mapt = new HashMap<Character,Integer>();
      for(int i = 0;i<t.length();i++){
          char c = t.charAt(i);
          if(mapt.containsKey(c)){
              mapt.put(c,mapt.get(c)+1);
          }
          else{
              mapt.put(c,1);
          }
      }
      HashMap<Character, Integer> maps = new HashMap<Character,Integer>();
      int count = 0;
      int left = 0;
      int minLength = s.length()+1;
      for(int i = 0;i<s.length();i++){
          char c = s.charAt(i);
          if(mapt.containsKey(c)){
              if(maps.containsKey(c)){
                  if(maps.get(c)<mapt.get(c)){
                     count++;
                  }
                  maps.put(c,maps.get(c)+1);
              }
              else{
                  maps.put(c,1);
                  count++;
              }
          }
       if(count == t.length()){
            char sc = s.charAt(left);
            while (!maps.containsKey(sc) || maps.get(sc) > mapt.get(sc)) {
                if (maps.containsKey(sc) && maps.get(sc) > mapt.get(sc))
                    maps.put(sc, maps.get(sc) - 1);
                left++;
                sc = s.charAt(left);
            }
 
            if (i - left + 1 < minLength) {
                res = s.substring(left, i + 1);
                minLength = i - left + 1;
            }
        }
    }
      return res;
    }
}