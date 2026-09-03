class Solution {
    public boolean uniformArray(int[] nums1) {
        int minodd = Integer.MAX_VALUE;
        for(int i : nums1){
            if(i%2==1){
                minodd = Math.min(minodd,i);
            }
        }
        for(int i : nums1){
            if(i%2==0 && minodd!=Integer.MAX_VALUE && i<minodd){
                return false;
            }
        }
        return true;
    }
}