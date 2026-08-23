class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String s : words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        ArrayList<String> list = new ArrayList<>();

        for(String s : map.keySet()){
           list.add(s);
        }
        Collections.sort(list, (a, b) -> {
            if (map.get(a) != map.get(b)) {
                return map.get(b) - map.get(a);
            }
            return a.compareTo(b);
        });

        // Take first k words
        return list.subList(0, k);
    }
}