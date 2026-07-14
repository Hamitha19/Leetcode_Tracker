// Last updated: 7/14/2026, 2:04:17 PM
class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int []arr=new int[n+n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        int c=n;
            for(int j=n-1;j>=0;j--){
            arr[c++]=nums[j];
            }
        
        return arr;
    }
}