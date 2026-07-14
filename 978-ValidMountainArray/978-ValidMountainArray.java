// Last updated: 7/14/2026, 2:06:10 PM
class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        int left=0,right=arr.length-1;
        while(left<right){
            if(arr[left]<arr[left+1]){
                left++;
            }else if(arr[right]<arr[right-1]){
                right--;
            }else{
                break;
            }

        }
        return left==right && left!=0 && right!=arr.length-1;
    }
}