// Last updated: 7/14/2026, 2:05:46 PM
class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        while(num>0){
           
            
            if(num%2!=0){
                num=num-1;
            }else{
                 num=num/2;
            }
            count++;
            }
           return count;
        }
        
    }
