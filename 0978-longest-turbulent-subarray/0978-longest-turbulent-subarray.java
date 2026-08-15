class Solution {
    public int maxTurbulenceSize(int[] arr) {
        if(arr.length == 1) return 1;
        int up = 1,down = 1;
        int max = 0;
        for(int i=1;i<arr.length;i++){
          if(arr[i]>arr[i-1]){
            up = down+1;
            down = 1;
          }else if(arr[i]<arr[i-1]){
            down = up+1;
            up = 1;
          }else{
            down = 1;
            up = 1;
          }
          max = Math.max(max,Math.max(up,down));
        }
         return max;
    }
}