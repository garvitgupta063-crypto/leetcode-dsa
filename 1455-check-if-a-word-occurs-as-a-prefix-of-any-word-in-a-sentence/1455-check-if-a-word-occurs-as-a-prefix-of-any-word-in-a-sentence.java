class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");
        int a = -1;
        for(int i=0;i<arr.length;i++){
            String str = arr[i];
            if(str.startsWith(searchWord)){
                a = i+1;
                break;
            }
        }
        return a;

    }
}