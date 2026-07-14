// Last updated: 7/14/2026, 2:07:26 PM
class Solution {
    public String reverseVowels(String s) {
        char []arr=s.toCharArray();
        int left=0,right=s.length()-1;
        while(left<right){
            while(left<right && !vowel(arr[left])){
                left++;
            }
            while(left<right && !vowel(arr[right])){
                right--;
            }
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
    }
    static boolean vowel(char c){
        c=Character.toLowerCase(c);
        return c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u';
    }
}