class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] arr = sentence.split(" ");
        int j = 0;
        while(j<dictionary.size()){
            String str = dictionary.get(j);
            for(int i=0;i<arr.length;i++){
                String st = arr[i];
                if(st.startsWith(str)){
                    arr[i] = str;
                }
            }
            j++;
        }
        return String.join(" ", arr);
    }
}