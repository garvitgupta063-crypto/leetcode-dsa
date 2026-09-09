class Solution {
    public long countCommas(long n) {
        long count = 0;
        long start = 1000;
        long commas = 1;

        while (start <= n) {
            long end;

            // Avoid overflow
            if (start > Long.MAX_VALUE / 1000) {
                end = Long.MAX_VALUE;
            } else {
                end = start * 1000 - 1;
            }

            long last = Math.min(n, end);

            count += (last - start + 1) * commas;

            if (start > Long.MAX_VALUE / 1000) {
                break;
            }

            start *= 1000;
            commas++;
        }

        return count;
    }
}