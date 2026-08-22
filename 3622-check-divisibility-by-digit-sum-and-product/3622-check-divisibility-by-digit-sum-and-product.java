class Solution {
    public boolean checkDivisibility(int n) {
        if(n<10){
            return false;
        }
        int sum = 0;
        int pro = 1;
        int m = n;
        while(n!=0){
            int a = n%10;
            sum += a;
            pro *= a;
            n /= 10;
        }
        int summ = sum+pro;
        return m%summ==0;
    }
}