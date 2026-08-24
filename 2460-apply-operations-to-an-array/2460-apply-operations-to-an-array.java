class Solution {
    public int[] applyOperations(int[] nums) {
        int[] arr = new int[nums.length];
        int q=0;
        for(int i=0;i<nums.length;i++){
            if(i!=nums.length-1){
            if(nums[i] == nums[i+1]){
                nums[i] = 2*nums[i];
                nums[i+1] = 0;
            }
            }
            if(nums[i]!=0){
               arr[q++] = nums[i];
            }
        }
        return arr;
    }
}