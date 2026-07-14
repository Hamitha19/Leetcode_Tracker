// Last updated: 7/14/2026, 2:08:13 PM
class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=0;
        
        for(int price:prices){
            if(price<min){
                min=price;
            }else{
                max=Math.max(max,price-min);
            }
        }
        return max;
    }
}