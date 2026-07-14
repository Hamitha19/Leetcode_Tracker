// Last updated: 7/14/2026, 2:04:22 PM
class Solution {
    public int countPermutations(int[] complexity) {
        int n=complexity.length;
        long mod=1_000_000_007L;
        for(int i=1;i<n;i++){
            if(complexity[i]<=complexity[0]){
                return 0;
            }
              complexity[0]= Math.min(complexity[0], complexity[i]);
        }
        long fact=1;
        for(int i=1;i<n;i++){
            fact=(fact*i)%mod;
        }
        return (int)fact;
    }
}