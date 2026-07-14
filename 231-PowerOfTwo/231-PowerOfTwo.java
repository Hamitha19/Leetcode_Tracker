// Last updated: 7/14/2026, 2:07:47 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
       return n>0 && (n & (n-1))==0; 
    }
}