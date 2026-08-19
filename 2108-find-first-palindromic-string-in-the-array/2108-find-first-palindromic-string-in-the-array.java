class Solution {
    public String firstPalindrome(String[] words) {
        String st = "";
       
        for(int i=0;i<words.length;i++){
            StringBuilder sb1 = new StringBuilder(words[i]);
            StringBuilder sb2 = new StringBuilder(words[i]).reverse();
            if(sb1.toString().equals(sb2.toString())) return words[i];
        }
        return st;
    }
}