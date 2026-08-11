// Last updated: 8/11/2026, 11:38:58 AM
1class Solution {
2    public int[] sortByBits(int[] arr) {
3        Integer []nums=new Integer[arr.length];
4        for(int i=0;i<arr.length;i++){
5            nums[i]=arr[i];
6        }
7        Arrays.sort(nums,(a,b) ->{
8            int A=Integer.bitCount(a);
9            int B=Integer.bitCount(b);
10            if(A!=B){
11                return A-B;
12            }
13            return a-b;
14        });
15        for(int i=0;i<arr.length;i++){
16            arr[i]=nums[i];
17        }
18        return arr;
19    }
20}