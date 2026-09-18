class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }

        int count = 0;
        int diff = 0;
        int prevdiff = 0;
        for(int i=1;i<nums.length;i++){
            diff = nums[i]-nums[i-1];
            if(diff>0&&prevdiff<=0){
                count++;
                prevdiff = diff;
            }else if(diff<0&&prevdiff>=0){
                count++;
                prevdiff = diff;
            }
        }
        return count+1;
    }
}