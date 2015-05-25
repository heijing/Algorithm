public class Permutation {
    public List<List<Integer>> permute(int[] num) {
          List<List<Integer>> res = new ArrayList<>();
        if(num.length == 0 || num == null){
            return res;
        }
        boolean[] used = new boolean [num.length];
        List<Integer> item = new ArrayList<>();
        helper(res,used,item,num);
        return res;
        
    }
    private void helper(List<List<Integer>> res,boolean[] used,List<Integer> item,int[] num){
        if(item.size() == num.length){
            res.add(new ArrayList<>(item));
            return;
        }
        for(int i = 0;i<num.length;i++){
            if(used[i]== false){
                used[i]= true;
                item.add(num[i]);
                helper(res,used,item,num);
                item.remove(item.size()-1);
                used[i] = false;
            }
        }
        
    }
      
}