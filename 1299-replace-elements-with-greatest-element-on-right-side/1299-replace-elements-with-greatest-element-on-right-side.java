class Solution {
    public int[] replaceElements(int[] arr) {
        int[] nums = new int[arr.length];
        Arrays.fill(nums,-1);
        if(arr.length == 1){
            return nums;
        }
        for(int i=0;i<arr.length-1;i++){
            int max = arr[i+1];
            for(int j=i+1;j<arr.length;j++){
               max = Math.max(max,arr[j]);
            }
            nums[i] = max;
        }
        return nums;
    }
}