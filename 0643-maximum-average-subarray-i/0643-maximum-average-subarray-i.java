class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int s = 0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        s = sum;
        for(int i=k;i<nums.length;i++){
            sum = sum - nums[i-k] + nums[i];
            if(s<sum) s = sum;
        }
        return (double)s/k;
    }
}