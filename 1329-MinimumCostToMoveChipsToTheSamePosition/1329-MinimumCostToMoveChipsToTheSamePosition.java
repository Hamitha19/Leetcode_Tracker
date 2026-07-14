// Last updated: 7/14/2026, 2:05:50 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd=0,even=0;
        for(int i:position){
            if(i%2==0){
                even++;
            }
            else{
                odd++;
            }
           
        } 
        return Math.min(odd,even);
    }
}