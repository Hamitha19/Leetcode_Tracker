// Last updated: 8/11/2026, 11:27:40 AM
1class Solution {
2    public boolean checkIfExist(int[] arr) {
3        for(int i=0;i<arr.length;i++){
4            for(int j=0;j<arr.length;j++){
5            if(2*arr[i]==arr[j] && i!=j){
6                return true;
7            }
8        }
9        }
10        return false;
11    }
12}