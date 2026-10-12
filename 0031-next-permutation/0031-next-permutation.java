class Solution {
    public void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            int k = 0;
            int l = n-1;
            while(k<l){
                int t = nums[k];
                nums[k] = nums[l];
                nums[l] = t;
                k++;
                l--;
            }
        }else{
        for(int i=n-1;i>idx;i--){
            if(nums[i]>nums[idx]){
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }
        int i = idx+1;
        int j = n-1;
        while(i<j){
            int tem = nums[i];
            nums[i] = nums[j];
            nums[j] = tem;

            i++;
            j--;
        }}
    }
}