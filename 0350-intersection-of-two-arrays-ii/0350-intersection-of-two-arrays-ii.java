class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
       
       boolean[] used = new boolean[nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && !used[j]) {
                    list.add(nums1[i]);
                    used[j] = true;
                    break;
                }
            }
        }
        int[] arr = new int[list.size()];
        int o = 0; 
        while (!list.isEmpty()) {
    arr[o] = list.remove(list.size() - 1);
    o++;
}
        return arr;
    }
}