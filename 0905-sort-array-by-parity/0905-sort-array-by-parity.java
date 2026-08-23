class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int a = nums.length;
        
        int b = 0;
        for(int i=0;i<a;i++){
            if(nums[i]%2==0){
                int temp = nums[b];
                nums[b] = nums[i];
                nums[i] = temp;
                b++;
            }
        }
        return nums;
    }
}