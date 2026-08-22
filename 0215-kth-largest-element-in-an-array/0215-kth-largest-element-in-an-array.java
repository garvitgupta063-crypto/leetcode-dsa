class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int a = 0;
        int i = 0;
        int j = nums.length-1;
        while(i<k){
            a = nums[j];
            j--;
            i++;
        }
        return a;

    }
}