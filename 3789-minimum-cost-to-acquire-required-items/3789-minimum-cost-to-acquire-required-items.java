class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long cost = 0;
        if((long)cost1+cost2 <= costBoth){
            cost = (long) cost1*need1 + (long)cost2*need2;
        }else{
            int cost3 = Math.min(need1,need2);
            cost = (long)cost3*costBoth;
            need1 -= cost3;
            need2 -= cost3;
            if(need1 > 0){
                cost += (long)need1*Math.min(cost1,costBoth);
            }else if(need2 > 0){
                cost += (long) need2*Math.min(cost2,costBoth);
            }
        }
        return cost;
    }
}