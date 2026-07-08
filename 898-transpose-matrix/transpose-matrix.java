class Solution {
    public int[][] transpose(int[][] arr) {
        int m = arr.length; 
        int n = arr[0].length;
        int[][] transpose = new int[n][m]; // Array to store the transposed matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                transpose[i][j] = arr[j][i];
                
            }
           
        }
        return transpose;

        
    }
}