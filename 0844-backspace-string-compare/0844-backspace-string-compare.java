class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> stt = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!st.empty()){
            if(ch=='#') st.pop();
            }
            if(ch!='#') st.push(ch);
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(!stt.empty()){
            if(ch=='#') stt.pop();
            }
            if(ch!='#') stt.push(ch);
        }
        if(st.size()!=stt.size()) return false;

        while(st.size()!=0){
            if(st.peek() != stt.peek()){
                return false;
            }
            st.pop();
            stt.pop();
        }
        return true;
    }
}