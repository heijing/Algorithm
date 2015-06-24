public class Reverse_Words {
    /**
     * @param s : A string
     * @return : A string
     * Total Runtime: 1472 ms
     */
    public String reverseWords(String s) {
        // write your code
        String[] ss = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i = ss.length-1;i >= 0;i--){
            if(res.length() == 0)
            res.append(ss[i]);
            else{
                res.append(" "+ss[i]);
            }
        }
        return res.toString();
    }
}

