// Last updated: 7/27/2026, 11:53:30 AM
1class Solution {
2    public List<Integer> addToArrayForm(int[] num, int k) {
3        List<Integer> ans=new ArrayList<>();
4        int carry=0;
5        int i=num.length-1;
6        while(i>=0 ||k>0 ||carry>0){
7            int sum=carry;
8            if(i>=0){
9                sum+=num[i];
10                i--;
11            }
12            if(k>0){
13                sum+=k%10;
14                k/=10;
15            }
16
17            ans.add(sum%10);
18            carry=sum/10;
19        }
20        Collections.reverse(ans);
21        return ans;
22    }
23}