class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = Integer.toString(num);
        int i=0;
        int j = k-1;
        int count = 0;
        while(j<s.length()){
            String str = "";
            for(int h=i;h<=j;h++){
                str += s.charAt(h);
            }
            int n = Integer.parseInt(str);
            if(n!=0&&num%n==0) count++;
            i++;
            j++;
        }
        return count;
    }
}