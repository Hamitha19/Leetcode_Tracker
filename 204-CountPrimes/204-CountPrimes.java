// Last updated: 7/14/2026, 2:07:52 PM
class Solution {
    public int countPrimes(int n) {
         boolean[] notPrime = new boolean[n];
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (!notPrime[i]) {
                count++;

                for (int j = i * 2; j < n; j += i) {
                    notPrime[j] = true;
                }
            }
        }

        return count;
    }
}