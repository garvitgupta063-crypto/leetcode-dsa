class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int i=0;
        int count = 0;
        while(i<nums.size()-1){
            for(int j=i+1;j<nums.size();j++){
                if(nums.get(i)+nums.get(j)<target) count++;
            }
            i++;
        }
        return count;
    }
}