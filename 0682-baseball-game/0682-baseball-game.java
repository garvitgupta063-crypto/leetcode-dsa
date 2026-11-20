class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for(String ch : op){
            if(ch.equals("+")){
                int top = st.pop();
                int nexttop = top+st.peek();
                st.push(top);
                st.push(nexttop);
            }else if(ch.equals("D")){
                st.push(2*st.peek());
            }else if(ch.equals("C")){
                ans -= st.pop();
                continue;
            }else{
                st.push(Integer.valueOf(ch));
            }
            ans += st.peek();
        }
        return ans;
    }
}