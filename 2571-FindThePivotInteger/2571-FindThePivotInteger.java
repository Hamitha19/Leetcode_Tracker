// Last updated: 7/14/2026, 2:05:02 PM
class Solution {
    public int pivotInteger(int n) {
        int a=n*(n+1)/2;
        double b=Math.sqrt(a);
        if(b-Math.ceil(b)==0){
            return (int)b;
        }else{
            return -1;
        }
    }
}