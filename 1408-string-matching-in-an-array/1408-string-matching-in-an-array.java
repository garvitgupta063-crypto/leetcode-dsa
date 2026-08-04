class Solution {
    public List<String> stringMatching(String[] words) {
        HashSet<String> set = new HashSet<>();
        
        for(int i=0;i<words.length;i++){
            String str = words[i];
            for(int j=0;j<words.length;j++){
                String st = words[j];
                if(i!=j && str.contains(st)) set.add(words[j]);
            }
        }
       
        return new ArrayList<>(set);
    }
}