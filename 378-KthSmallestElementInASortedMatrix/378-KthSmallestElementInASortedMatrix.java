// Last updated: 7/14/2026, 2:07:13 PM
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int low=matrix[0][0],high=matrix[n-1][n-1];
        while(low<high){
            int mid=low+(high-low)/2;
            int count=0,col=0,row=n-1;
            while(row>=0 && col<n){
                if(matrix[row][col]<=mid){
                    count+=row+1;
                    col++;
                }else{
                    row--;
                }
            }
            if(count<k){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
}