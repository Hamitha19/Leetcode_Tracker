// Last updated: 7/14/2026, 2:05:14 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
        int a=num;
        int rev=0;
        while(num>0){
            int sum=num%10;
            rev=(rev*10)+sum;
            num=num/10;

        }
        int rev1=0;
        while(rev>0){
            int digit=rev%10;
            rev1=(10*rev1)+digit;
            rev=rev/10;

        }
        if(rev1==a){
            return true;
        }else{
            return false;
        }
       
    }
}