// Last updated: 9/23/2026, 8:31:35 PM
1class Solution {
2    public int[] sortEvenOdd(int[] nums) {
3        int n=nums.length;
4        int j=0;
5        int k=0;
6        int []o=new int[n/2];
7        int []e=new int[(n+1)/2];
8        for(int i=0;i<nums.length;i++){
9            if(i%2==0){
10                e[j++]=nums[i];
11            }else{
12                o[k++]=nums[i];
13            }
14        }
15        Arrays.sort(e);
16        Arrays.sort(o);
17        j=0;
18        k=o.length-1;
19        for(int i=0;i<nums.length;i++){
20            if(i%2==0){
21                nums[i]=e[j++];
22            }else{
23                nums[i]=o[k--];
24            }
25        }
26        return nums;
27    }
28}