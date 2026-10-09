class Solution {
    public int arrangeCoins(int n) {
        int a = 1;
        int count = 0;
        while(n>=a){
            n -= a;
            count++;
            a++;
        }
        return count;
    }
}