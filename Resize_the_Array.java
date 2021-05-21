class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] twoD=new int[r][c];
        int row=mat.length;
        int col=mat[0].length;
        if(row*col!=r*c){
            return mat;
        }
        int a=0;
        int b=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                twoD[i][j]=mat[a][b];
                b++;
                if(b==col){
                    b=0;
                    a++;
                }
            }
        }
        return twoD;
    }
}
