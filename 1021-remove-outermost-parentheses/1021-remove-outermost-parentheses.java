class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int n = 0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                if(n>0) str.append(ch);
                n++;
            }else{
                n--;
                if(n>0) str.append(ch);
            }
        }
        return str.toString();
    }
}