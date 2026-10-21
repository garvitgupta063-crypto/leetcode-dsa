class Solution {
    public int hIndex(int[] arr) {
        Arrays.sort(arr);
        int a = 0;
        for(int i=0;i<arr.length;i++){
            int b = arr.length - i;
            if(arr[i]>=b){
                return b;
            }
        }
        return a;
    }
}