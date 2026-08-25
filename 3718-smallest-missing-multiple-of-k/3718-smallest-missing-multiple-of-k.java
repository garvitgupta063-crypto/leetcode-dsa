class Solution {
    public int missingMultiple(int[] nums, int k) {
        int i=1;
        while(true){
            int a = k*i;
            boolean flag = false;
            for(int j=0;j<nums.length;j++){
                if(a==nums[j]){
                    flag = true;
                }
            }
            if(!flag){
                return a;
            }
            i++;
        }
    }
}