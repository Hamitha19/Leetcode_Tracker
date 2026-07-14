// Last updated: 7/14/2026, 2:07:54 PM
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        
        while(n!=0 && !set.contains(n) ){
             int digit=0;
           set.add(n);
           while(n>0){
            int temp=n%10;
            digit+=temp*temp;
            n/=10;
           }
        
        n=digit;
        }
        
        return n==1;
    }
}