// Last updated: 8/18/2026, 12:28:43 PM
1class Solution {
2    public int[] finalPrices(int[] prices) {
3        int []arr=new int[prices.length];
4        for(int i=0;i<prices.length;i++){
5            arr[i]=prices[i];
6            for(int j=i+1;j<prices.length;j++){
7                if(prices[j]<=prices[i]){
8                    arr[i]=prices[i]-prices[j];
9                    break;
10                }
11            }
12        }
13        
14        return arr;
15    }
16}