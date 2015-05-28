public class lengthOfSubstring{
	public int lengthOfSubString(String s){
	   if(s == null || s.length() == 0)
	      return 0;
	   int max = 0;
	   int runner = 0;
	   int walker = 0;
	   HashTable<Character> set = new HashTable<Character>();
	   while(runner <s.length){
	       if(set.contains(s.charAt(runner))){
	           if(max < runner-walker){
	             max = runner-walker;
	           }
	           while(s.charAt(walker) != s.charAt(runner)){
	              set.remove(s.charAt(walker));
	              walker++:
	           }
	           walker++;

	       }
	       else{
	          set.add(s.charAt(runner));
	       }
            runner++;
	   }
	   max = Math.math(max,runner-walker);
	   return max;
	}
}