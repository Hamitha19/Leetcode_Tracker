// Last updated: 9/28/2026, 11:55:01 AM
1class Solution {
2    public int candy(int[] ratings) {
3        int n=ratings.length;
4        int []candy=new int[n];
5        for(int i=0;i<n;i++){
6            candy[i]=1;
7        }
8        for(int i=1;i<n;i++){
9            if(ratings[i]>ratings[i-1]){
10                candy[i]=candy[i-1]+1;
11            }
12        }
13        for(int i=n-2;i>=0;i--){
14            if(ratings[i]>ratings[i+1]){
15                candy[i]=Math.max(candy[i],candy[i+1]+1);
16            }
17        }
18        int total=0;
19        for(int i=0;i<n;i++){
20            total+=candy[i];
21        }
22        return total;
23    }
24}