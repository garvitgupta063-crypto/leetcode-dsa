class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        
        int[] freq1 = new int[26];
        int[] window = new int[26];

        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
        }
        int k = s1.length();
        for(int i=0;i<k;i++){
            window[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq1,window)) return true;

        for(int i=k;i<s2.length();i++){
            window[s2.charAt(i)-'a']++;

            window[s2.charAt(i-k)-'a']--;

            if(Arrays.equals(freq1,window)){ return true; }
        }
        return false;
    }
}