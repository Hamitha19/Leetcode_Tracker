// Last updated: 8/13/2026, 12:35:21 PM
1class Solution {
2    public int maximum69Number (int num) {
3        char []arr=String.valueOf(num).toCharArray();
4        for(int i=0;i<arr.length;i++){
5            if(arr[i]=='6'){
6                arr[i]='9';
7                break;
8            }
9        }
10        return Integer.parseInt(new String(arr));
11    }
12}