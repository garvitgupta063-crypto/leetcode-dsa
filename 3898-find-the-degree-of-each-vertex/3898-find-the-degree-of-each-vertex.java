class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                count += matrix[i][j];
            }
            arr[i] = count;
        }
        return arr;
    }
}