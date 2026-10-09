class Solution {
    public int longestSubarray(int[] nums) {
        int count = 0;
        int maxcount = 0;
        for(int i=2;i<nums.length;i++){
            if(nums[i-2]+nums[i-1]==nums[i]){
                count++;
                maxcount = Math.max(count,maxcount);
            }else if(nums[i-2]+nums[i-1]!=nums[i]){
                count = 0;
            }
        }
        return maxcount+2;
    }
}