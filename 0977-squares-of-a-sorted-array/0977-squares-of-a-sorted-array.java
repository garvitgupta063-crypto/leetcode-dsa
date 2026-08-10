class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = nums.length - 1;
        int[] arr = new int[n];
        for(int i=nums.length-1;i>=0;i--){
            int lefts = nums[left]*nums[left];
            int rights = nums[right]*nums[right];
            if(lefts<rights){
                arr[i] = rights;
                right--;
            }else{
                arr[i] = lefts;
                left++;
            }
        }
        return arr;
    }
}