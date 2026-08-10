class Solution {
    public int[] sortedSquares(int[] nums) {
        int a = nums.length;
        int[] arr = new int[a];
        int b = 0;
        for(int i=0;i<nums.length;i++){
            int c = nums[i];
            b = (int)Math.pow(c,2);
            arr[i] = (int)b;
        }
        Arrays.sort(arr);
        return arr;
    }
}