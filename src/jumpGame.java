public class jumpGame {
    /**
     * @param A: A list of integers
     * @return: The boolean answer
     */
    public boolean canJump(int[] A) {
        boolean[] can = new boolean[A.length];
        can[0] = true;
        
        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                if (can[j] && j + A[j] >= i) {
                    can[i] = true;
                    break;//every A[i] represents from 0 to i whether or not is a pass,A[j] is a  bridge,so A[j]&& A[i-j] both is satisfied
                }
            }
        }
        
        return can[A.length - 1];
    }
    
}
