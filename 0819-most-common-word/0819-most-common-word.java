class Solution {
    public String mostCommonWord(String p, String[] banned) {
        HashSet<String>  ban = new HashSet<>(Arrays.asList(banned)); 
        HashMap<String,Integer> map = new HashMap<>();
        String[] word = p.replaceAll("\\W+"," ").toLowerCase().split("\\s+");
        for(String str : word){
            if(!ban.contains(str)){
                map.put(str,map.getOrDefault(str,0)+1);
            }
        }
        return Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getKey();
    
    }
}