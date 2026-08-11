class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1) sum += nums[i];
            else break;
        }

        int condiate = sum;
        while(true){
            boolean found = false;
            for(int num : nums){
                if(num == condiate){
                    found = true;
                    break;
                }
            }
            if(!found) return condiate;
            condiate++;
        }
    }
}