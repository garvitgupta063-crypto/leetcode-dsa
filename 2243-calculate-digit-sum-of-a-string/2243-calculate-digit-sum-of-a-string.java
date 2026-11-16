class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            String str = "";
            int a = 0;
            int sum = 0;
            for(int i=0;i<s.length();i++){
                sum += s.charAt(i)-'0';
                a++;
                if(a==k){
                    str += sum;
                    sum =0 ;
                    a = 0;
                }
            }
            if(a!=0){
                str += sum;
                sum = 0;
            }
            s = str;
        }
        return s;
    }
}