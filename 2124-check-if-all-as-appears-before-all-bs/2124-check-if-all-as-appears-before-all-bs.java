class Solution {
    public boolean checkString(String s) {
        boolean found = false;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='b'){
                found = true;
            }else if(ch == 'a' && found){
                return false;
            }
        }
        return true;
    }
}