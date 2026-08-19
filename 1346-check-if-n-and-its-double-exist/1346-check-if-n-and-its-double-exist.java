class Solution {
    public boolean checkIfExist(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int a = arr[i];
            for(int j=0;j<arr.length;j++){
                if(j==i) continue;
                if(arr[j]*2==a) return true;
            }
            i++;
        }
        return false;
    }
}