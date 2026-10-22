class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length == 1) return 0;
        Arrays.sort(nums);
        int gap = 0;
        for(int i=0;i<nums.length-1;i++){
        
            int a = Math.abs(nums[i]-nums[i+1]);
            gap = Math.max(gap,a);
        }
        return gap;
    }
}