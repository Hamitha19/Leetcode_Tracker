// Last updated: 7/23/2026, 3:11:58 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int area=0,left=0,right=height.length-1;
4        while(left<right){
5                int width=(right-left);
6                int currarea=width*(Math.min(height[left],height[right]));
7                area=Math.max(area,currarea);
8            
9        if(height[left]<height[right]){
10            left++;
11        }else{
12            right--;
13        }
14        }
15        return area;
16    }
17}