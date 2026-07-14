// Last updated: 7/14/2026, 2:07:44 PM
class Solution {
    public int addDigits(int num) {
        while(num>9){
            int dig=0;
            while(num>0){
                int temp=num%10;
                dig+=temp;
                num/=10;
            }
            num=dig;
        }
        return num;
    }
}