
class Solution {
    public int maximumPossibleSize(int[] nums) {
        int count = 0;
        int max = 0;

        for (int num : nums) {
            if (num >= max) {
                count++;
                max = num;
            }
        }

        return count;
    }
}
