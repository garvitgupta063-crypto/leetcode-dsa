class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);

        int diff = Integer.MAX_VALUE;

        // Find minimum difference
        for (int i = 1; i < arr.length; i++) {
            diff = Math.min(diff, arr[i] - arr[i - 1]);
        }

        List<List<Integer>> ans = new ArrayList<>();

        // Find all pairs
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] - arr[i - 1] == diff) {
                ans.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }

        return ans;
    }
}