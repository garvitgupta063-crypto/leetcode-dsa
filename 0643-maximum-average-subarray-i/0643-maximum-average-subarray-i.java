class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int sum1 = sum;
        int j = 0;
        for(int i=k;i<nums.length;i++){
            sum += nums[i]-nums[j++];
            sum1 = Math.max(sum1,sum);
        }
        return (double)sum1/k;
    }
}