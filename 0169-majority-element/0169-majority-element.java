class Solution {
    public int majorityElement(int[] nums) {
        int cond = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(count == 0){
                cond = nums[i];
                count++;
            }else if(nums[i] == cond){
                  count++;
            }else{
                count--;
            }
        }
        return cond;
    }
}