class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i=0;
        int j = arr.length-1;
        while(i<=j){
            char ch = arr[i];
            char chh = arr[j];
            if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')&&(chh=='a'||chh=='e'||chh=='i'||chh=='o'||chh=='u'||chh=='A'||chh=='E'||chh=='I'||chh=='O'||chh=='U')){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }else if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')){
                j--;
            }else{
                i++;
            }
        }
       StringBuilder sb = new StringBuilder();

for (char num : arr) {
    sb.append(num);
}

String str = sb.toString();
        return str;
    }
}