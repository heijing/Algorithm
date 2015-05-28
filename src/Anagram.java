public class Anagram{
	public List<String> anagrams(String[] strs) {
        List<String> res = new ArrayList<String>();
        if(strs == null || strs.length == 0)  
         return res;
        HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
        
        for(int i = 0; i <strs.length;i++){
            char[] strChar = strs[i].toCharArray();
            Arrays.sort(strChar);
            String str = new String(strChar);
            if(map.containsKey(str)){
                map.get(str).add(strs[i]);
            }
            else{
                ArrayList<String> list = new ArrayList<String>();
                list.add(strs[i]);
                map.put(str,list);
            }
        }
            Iterator it = map.values().iterator();
            while(it.hasNext()){
                ArrayList<String> item = (ArrayList<String>)it.next();
                if(item.size()>1){
                    res.addAll(item);
                }
            }
     return res;
     }
}