public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if(candidates == null || candidates.length == 0)
          return res;
        List<Integer> item = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,target,0,res,item);
        return res;
          
        
    }
    public void helper(int[] candidates,int target,int start,List<List<Integer>> res,List<Integer> item){
        if(target <0)
          return;
        if(target == 0){
            res.add(new ArrayList<Integer>(item));
            return;
        }
        for(int i = start;i<candidates.length;i++){
            if(i>0 && candidates[i-1] == candidates[i])
              continue;
            item.add(candidates[i]);
            helper(candidates,target-candidates[i],i,res,item);
            item.remove(item.size()-1);
        }
    }
}