class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])==k){
                    int a = Math.max(nums[i],nums[j]);
                    int b = Math.min(nums[i],nums[j]);
                    set.add(b+","+a);
                }
            }
        }
        return set.size();
    }
}