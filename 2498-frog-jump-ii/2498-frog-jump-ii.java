class Solution {
    public int maxJump(int[] stones) {
        int ans = 0;

        for (int i = 2; i < stones.length; i++) {
            ans = Math.max(ans, stones[i] - stones[i - 2]);
        }

        return Math.max(ans, stones[1] - stones[0]);
    }
}