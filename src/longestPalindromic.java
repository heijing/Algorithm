public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> item = new ArrayList<String>();
        helper(s,res,item,0,getDict(s));
        return res;
        
    }
    public void helper(String s,List<List<String>>res,List<String> item,int start,boolean[][]dict){
        if(start == s.length()){
            res.add(new ArrayList<String>(item));
            return;
        }
        for(int i = start;i<s.length();i++){
            if(dict[start][i] == true){
                item.add(s.substring(start,i+1));
                helper(s,res,item,i+1,dict);
                item.remove(item.size()-1);
            }
        }
        
    }
    private boolean[][] getDict(String s){
        boolean [][] dict = new boolean [s.length()][s.length()];
        for(int i =s.length()-1;i>=0;i--){
            for(int j = i;j<s.length();j++){
                if(s.charAt(i) == s.charAt(j) && (j-i<=2 || dict[i+1][j-1] == true)){
                    dict[i][j] = true;
                }
            }
        }
         return dict;
    }
}