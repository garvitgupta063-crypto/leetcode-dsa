class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        while(j<s.length()){
            char ch = s.charAt(j);
            if(vowel(ch)){
                count++;
            }

            if(j-i+1==k){
                max = Math.max(max,count);
                if(vowel(s.charAt(i))){
                    count--;
                }
                i++;
            }
            j++;
        }
        return max;
    }
    public boolean vowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}