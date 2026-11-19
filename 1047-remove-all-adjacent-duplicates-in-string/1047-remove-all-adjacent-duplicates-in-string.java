class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(st.empty()){
                st.push(ch);
            }else if(st.peek()==ch){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        StringBuilder str = new StringBuilder();
        while(!st.empty()){
            char ch = st.pop();
            str.append(ch);
           
        } 
        return str.reverse().toString();
    }
}