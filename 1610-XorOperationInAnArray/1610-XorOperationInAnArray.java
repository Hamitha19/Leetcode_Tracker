// Last updated: 7/14/2026, 2:05:37 PM
class Solution {
    public int xorOperation(int n, int start) {
        int xor=0;
        for(int i=0;i<n;i++){
            xor^=start+2*i;
        }
        return xor;
    }
}