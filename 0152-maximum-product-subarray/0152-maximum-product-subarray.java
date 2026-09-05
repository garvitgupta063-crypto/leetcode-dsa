class Solution {
    public int maxProduct(int[] nums) {
        int pro = nums[0];
        for(int i=0;i<nums.length;i++){
            int p = nums[i];
            for(int j=i+1;j<nums.length;j++){
                p *= nums[j];
                pro = Math.max(pro,p);
            }
            pro = Math.max(pro,nums[i]);
        }
        
        return pro;
    }
}