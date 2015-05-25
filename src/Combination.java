public class Combination {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> item = new ArrayList<>();
        if(n <= 0 || k == 0)
            return res;
        helper(n,1,k,res,item);
        return res;
        
    }
    public void helper(int n,int start,int k,List<List<Integer>>res,List<Integer>item){
        if(item.size() == k){
            res.add(new ArrayList<>(item));
            return;
        }
        for(int i = start; i<=n;i++){
            item.add(i);
            helper(n,i+1,k,res,item);
            item.remove(item.size()-1);
        }
    }
}