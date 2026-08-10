class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        int[] arr = new int[2147483];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        List<Integer> list = new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(arr[i+1]==0){
                list.add(i+1);
            }
        }
        return list;
    }
}