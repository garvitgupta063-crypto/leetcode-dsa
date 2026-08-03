class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int a = countDigit(nums[i]);
            if(a%2==0) count++;
        }
        return count;
    }

    public int countDigit(int n){
        int count = 0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
}