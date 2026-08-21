class Solution {
    public String frequencySort(String s) {
        int[] arr = new int[256];;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        StringBuilder str = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            int max = findmax(arr);
            if(max>0){
              for(int j=0;j<arr.length;j++){
                 if(arr[j]==max){
                    for(int k=0;k<max;k++){
                        str.append((char)j);
                    }
                    arr[j] = 0;
                 }
              }
            }
        }
        return str.toString();
        
    }

    public int findmax(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
}