class Solution {
    public int minStoneSum(int[] piles, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            Collections.reverseOrder()
        );

        int sum = 0;

        for (int pile : piles) {
            pq.add(pile);
            sum += pile;
        }

        while (k-- > 0) {
            int max = pq.poll();

            int removed = max / 2;
            max = max - removed;

            sum -= removed;

            pq.add(max);
        }

        return sum;
    }
}