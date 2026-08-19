class Solution {
    public int maxWidthRamp(int[] nums) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<nums.length;i++){
            if(st.isEmpty()||nums[i]<nums[st.peek()]){
                st.push(i);
            }
        }
        int ans = 0;
        for(int i=nums.length-1;i>=0;i--){
           while(!st.isEmpty()&&nums[st.peek()]<=nums[i]){
            ans = Math.max(ans,i-st.pop());
           }
        }
        return ans;
    }
}