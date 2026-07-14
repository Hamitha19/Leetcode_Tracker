// Last updated: 7/14/2026, 2:05:48 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        while(n>0){
            int digit=n%10;
            product=product*digit;
            sum=sum+digit;
            n=n/10;
        }
        return product-sum;
    }
}