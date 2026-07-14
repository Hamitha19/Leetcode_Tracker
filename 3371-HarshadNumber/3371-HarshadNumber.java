// Last updated: 7/14/2026, 2:04:30 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int m=x;
        int digit=0;
        while(x>0){
            int a=x%10;
            digit=digit+a;
            x=x/10;

        }
        if(m%digit==0){
            return digit;

        }else{
            return -1;
        }
    }
}