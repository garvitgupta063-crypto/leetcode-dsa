class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int f = flowerbed.length;
        for(int i=0;i<f&&n>0;i++){
            boolean prev =  i==0 || flowerbed[i-1]==0;
            boolean fet = i==f-1 || flowerbed[i+1]==0;
            if(prev && fet && flowerbed[i]==0) {
                flowerbed[i]=1;
                n--;
            }
        }
        return n<=0;
    }
}