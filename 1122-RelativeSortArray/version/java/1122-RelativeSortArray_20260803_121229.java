// Last updated: 8/3/2026, 12:12:29 PM
1class Solution {
2    int mod=1000000007;
3    public int numPrimeArrangements(int n) {
4        int prime=0;
5        for(int i=2;i<=n;i++){
6            boolean found=true;
7            for(int j=2;j*j<=i;j++){
8            if(i%j==0){
9                found=false;
10                break;
11            }
12        }
13        if(found){
14            prime++;
15        }
16        }
17        int nonprime=n-prime;
18        long ans=1;
19        for(int i=2;i<=prime;i++){
20            ans=(ans*i)%mod;
21        }
22        for(int i=2;i<=nonprime;i++){
23            ans=(ans*i)%mod;
24        }
25        return (int)ans;
26    }
27}