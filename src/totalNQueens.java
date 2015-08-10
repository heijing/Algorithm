public class totalNQueens {
    public int totalNQueens(int n) {
         List<Integer> res = new ArrayList<>();
         res.add(0);
         helper(n,0,new int[n],res);
         return res.get(0);
        
    }
    public void helper(int n, int row,int [] colForRow,List<Integer> res){
        if(n == row){
            res.set(0,res.get(0)+1);
            return;
        }
        for(int i = 0;i<n;i++){
            colForRow[row] = i;
            if(check(row,colForRow)){
                helper(n,row+1,colForRow,res);
            }
        }
    }
    public boolean check(int row,int [] colForRow){
        for(int i = 0;i<row;i++){
            if(colForRow[i] == colForRow[row] || Math.abs(colForRow[i]-colForRow[row])== row-i)
              return false;
        }
        return true;
    }
}