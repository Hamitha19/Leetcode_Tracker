// Last updated: 7/14/2026, 2:05:44 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int sum=0;
        int max=candies[0];
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            sum=candies[i]+extraCandies;
            if(sum>=max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}