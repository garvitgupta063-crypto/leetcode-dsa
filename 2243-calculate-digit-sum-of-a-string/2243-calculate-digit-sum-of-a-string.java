class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            String str = "";
            int j = 0;
            while(j<s.length()){
                int sum = 0;
            for(int i=0;i<k;i++){
                sum += s.charAt(j++)-'0';
                if(j>=s.length()) break;
            }
            str += sum;
            }
            s = str;
        }
        return s;
    }
}