class Solution {
    public void setZeroes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        boolean r[]=new boolean[n];
        boolean c[]=new boolean[m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    r[i]=true;
                    c[j]=true;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
         if(r[i]||c[j]){
            mat[i][j]=0;
         }
            }
        }
        System.out.println(Arrays.deepToString(mat));

          }
}