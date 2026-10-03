class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int diff1 = 0;
        int diff2 = 0;
        int[] arr= new int[2];
        Arrays.fill(arr,-1);
        int i = 0;
        while(i<nums.length){
        for(int j=0;j<nums.length;j++){
            diff1 = Math.abs(i-j);
            diff2 = Math.abs(nums[i]-nums[j]);
            if(diff1>=indexDifference && diff2>=valueDifference){
                arr[0] = i;
                arr[1] = j;
            }
        }
        i++;
    }
        return arr;
    }
}