// Last updated: 7/14/2026, 2:07:55 PM
class Solution {
    public int hammingWeight(int n) {
        int a=0;
        while(n>0){
            n=n&n-1;
            a++;
        }
        return a;
    }
}