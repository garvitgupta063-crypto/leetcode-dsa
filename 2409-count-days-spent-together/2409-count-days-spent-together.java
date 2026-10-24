class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int aA = toDays(arriveAlice,days);
        int lA = toDays(leaveAlice,days);
        int aB = toDays(arriveBob,days);
        int lB = toDays(leaveBob,days);
        int a = Math.max(aA,aB);
        int b = Math.min(lA,lB);
        return a<=b ? b-a+1:0;
    }
    public int toDays(String s,int[] days){
        int m = (s.charAt(0)-'0')*10 + (s.charAt(1)-'0');
        int d = (s.charAt(3)-'0')*10 + (s.charAt(4)-'0');
        int res = d;
        for(int i=0;i<m-1;i++){
            res += days[i];
        }
        return res;
    }
}