class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
       Set<Integer> set = new HashSet<>();
       for(int i=0;i<nums.length;i++){
        set.add(nums[i]);
       }
       int longest = 1;
       for(int i : set){
        if(!set.contains(i-1)){
            int count = 1;
            int x = i;
            while(set.contains(x+1)){
                x = x+1;
                count++;
            }
            longest = Math.max(longest,count);
        }
       }
       return longest;
    }
}