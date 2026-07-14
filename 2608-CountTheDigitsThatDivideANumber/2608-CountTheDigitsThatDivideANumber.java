// Last updated: 7/14/2026, 2:04:59 PM
class Solution {
    public int countDigits(int num) {
        int dig=0;
        int count=0;
        int n=num;
        while(num>0){
            int temp=num%10;
           if(n%temp==0){
            count++;
           }
            num/=10;
        }
        return count;
    }
}