class Solution {
    public int clumsy(int n) {
        Stack<Integer> st = new Stack<>();
        st.push(n);
        n--;
        int i = 0;
        while(n>0){
            if(i==0){
                st.push(st.pop()*n);
            }else if(i==1){
                st.push(st.pop()/n);
            }else if(i==2){
                st.push(n);
            }else if(i==3){
                st.push(-n);
            }

            i = (i+1)%4;
            n--;
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}