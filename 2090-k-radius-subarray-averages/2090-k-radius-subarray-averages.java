class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.fill(arr,-1);
         

        int w = 2*k+1;
        if(n<w){
            return arr;
        }

        long sum = 0;
        for(int i=0;i<w;i++){
            sum += nums[i];
        }
        arr[k] = (int)(sum/w);

        for(int i=w;i<n;i++){
            sum += nums[i]-nums[i-w];

            int center = i - k;
            arr[center] = (int)(sum / w);
        }
        return arr;
    }
}