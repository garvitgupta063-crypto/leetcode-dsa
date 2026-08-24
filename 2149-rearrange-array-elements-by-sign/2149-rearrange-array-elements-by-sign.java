class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] p = new int[n/2];
        int[] q = new int[n/2];
        
        int a = 0;
        int m = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                q[a++] = nums[i];
            }else{
                p[m++] = nums[i];
            }
        }
        a = 0;
        m = 0;
        int[] arr = new int[n];
        for(int i=0;i<n;i+=2){
            arr[i] = p[a++];
            arr[i+1] = q[m++];
        }
        return arr;

    }
}