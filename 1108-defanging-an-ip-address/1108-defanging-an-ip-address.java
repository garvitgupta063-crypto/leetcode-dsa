class Solution {
    public String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        String[] arr = address.split("\\.");
        for(int i=0;i<arr.length;i++){
            str.append(arr[i]);
            if(i!=arr.length-1){
                str.append("[.]");
            }
        }
        return str.toString();
        
    }
}