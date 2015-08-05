public class letterCombination {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> queue = new LinkedList<String>();
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if(digits.length() == 0 || digits == null)
          return queue;
        queue.add("");
        for(int i = 0;i<digits.length();i++){
            int a = ((int)digits.charAt(i) -'0');
            while(queue.peek().length() == i){
                String st = queue.remove();
                for(char c :mapping[a].toCharArray()){
                    queue.add(st+c);
                }
            }
        }
         return queue;
        
    }
}