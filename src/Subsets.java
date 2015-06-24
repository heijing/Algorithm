public class Subsets{
	ppublic List<List<Integer>> subsets(int[] S) {
        List<List<Integer>> res = new ArrayList<>();
        if(S==null || S.length==0){
        return res;
        }
        Arrays.sort(S);
        List<Integer> curRes =new ArrayList<>();
        helper(S,0,curRes,res);
        return res;
        
    }
    private void helper(int[] S,int start,List<Integer> curRes, List<List<Integer>> res){
        List<Integer> tempRes = new ArrayList<>(curRes);
        res.add(tempRes);
        for(int i=start;i<S.length;i++){
            curRes.add(S[i]);
            helper(S,i+1,curRes,res);
            curRes.remove(curRes.size()-1);
        }
    }
}