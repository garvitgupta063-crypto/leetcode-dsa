class Solution {
    public int minMoves(int[] nums) {
        int m = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<m) m=nums[i];
        }
        long count = 0;
        for(int i=0;i<nums.length;i++){
            count += nums[i]-m;
        }
        return (int)count;
    }
}