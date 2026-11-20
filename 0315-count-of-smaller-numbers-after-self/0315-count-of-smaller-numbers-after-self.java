class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> sorted = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = nums.length - 1; i >= 0; i--) {

            int low = 0;
            int high = sorted.size();

            while (low < high) {
                int mid = low + (high - low) / 2;

                if (sorted.get(mid) < nums[i]) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }

            ans.add(low);
            sorted.add(low, nums[i]);
        }

        Collections.reverse(ans);
        return ans;
    }
}