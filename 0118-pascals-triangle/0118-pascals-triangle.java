class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            list.add(row(i));
        }
        return list;
    }
    public List<Integer> row(int rowIndex){
        List<Integer> list = new ArrayList<>();
        long ans = 1;
        list.add((int)ans);
        for(int i=1;i<=rowIndex;i++){
            ans = ans * (rowIndex - i + 1) / i;
            list.add((int) ans);
        }
        return list;
    }
}