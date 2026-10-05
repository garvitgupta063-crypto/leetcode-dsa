class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        boolean[] used = new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            if(used[i]){
                continue;
            }
            String str = strs[i];
            List<String> list1 = new ArrayList<>();
            list1.add(str);
            for(int j=i+1;j<strs.length;j++){
                if(used[j]){
                    continue;
                }
                if(Anagram(strs[i],strs[j])){
                    list1.add(strs[j]);
                    used[j] = true;
                }
            }
            list.add(list1);
        }
        return list;
    }
    public static boolean Anagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int[] freq = new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;
    }
}