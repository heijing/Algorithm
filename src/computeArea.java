public class computeArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int squareA = (C-A)*(D-B);
        int squareB = (G-E)*(H-F);
        int left = Math.max(A,E);
        int right = Math.min(C,G);
        int up = Math.min(D,H);
        int bottom = Math.max(B,F);
        int overlap = 0;
        if(right >left && up >bottom){
            overlap = (up-bottom)*(right-left);
        }
        return squareA+squareB-overlap;
    }
}