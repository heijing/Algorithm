public class wordLadder {
    public int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
        if(beginWord == null || endWord == null || beginWord.length() == 0 || endWord.length() == 0 || beginWord.length() != endWord.length())
        return 0;
        LinkedList<String> queue = new LinkedList<String>();
        HashSet<String> visited = new HashSet<String>();
        int lastNum =1;
        int level = 1;
        int curNum = 0;
        queue.offer(beginWord);
        visited.add(beginWord);
        while(!queue.isEmpty()){
            String cur = queue.poll();
            lastNum--;
            for(int i = 0;i<cur.length();i++){
              char[] curStr = cur.toCharArray();
              for(char c ='a';c<='z';c++){
                 curStr [i] = c;
                 String temp = new String(curStr);
                 if(temp.equals(endWord)){
                     return level+1;
                 }
                 if(wordDict.contains(temp) && !visited.contains(temp)){
                     curNum++;
                     queue.offer(temp);
                     visited.add(temp);
                     
                 }
                  
              }
              
        }
           if(lastNum == 0){
               level = level+1;
               lastNum = curNum;
               curNum = 0;
            
           }
            
        }
        return 0;
        
    }
}