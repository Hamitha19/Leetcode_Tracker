// Last updated: 7/14/2026, 2:05:24 PM
class Solution {
    public int countTriples(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                int c=i*i + j*j;
                int c2=(int)Math.sqrt(c);
                if(c2<=n && c2*c2==c){
                    count+=2;
                }
            
            

            }
        }
        return count;
    }
}