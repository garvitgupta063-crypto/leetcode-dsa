class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
       
       boolean[] used = new boolean[nums2.length];

        int i=0;
        while(i<nums1.length){
            for(int k=0;k<nums2.length;k++){
                if(nums1[i]==nums2[k]&&!used[k]){
                    used[k] = true;
                    list.add(nums1[i]);
                    break;
                }
            }
            i++;
        }
       int[] answer = new int[list.size()];

        int j = 0;
        for (int num : list) {
            answer[j++] = num;
        }

        return answer;
    }
}