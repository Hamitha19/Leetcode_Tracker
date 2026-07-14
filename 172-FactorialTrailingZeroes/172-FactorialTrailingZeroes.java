// Last updated: 7/14/2026, 2:08:00 PM
class Solution {
    public int trailingZeroes(int n) {
            return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}