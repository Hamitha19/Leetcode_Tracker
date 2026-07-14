// Last updated: 7/14/2026, 2:07:57 PM
class Solution {
    public int reverseBits(int n) {
        String s=String.format("%32s",Integer.toBinaryString(n)).replace(' ','0');
        String rev=new StringBuilder(s).reverse().toString();
        return (int)Long.parseLong(rev,2);
    }
}