// Last updated: 9/12/2026, 11:45:34 AM
1class Solution {
2    public String reversePrefix(String word, char ch) {
3        if(word.indexOf(ch)==-1){
4            return word;
5        }
6        int left=0;
7        int right=word.indexOf(ch);
8        char []a=word.toCharArray();
9        while(left<right){
10            char temp=a[left];
11            a[left]=a[right];
12            a[right]=temp;
13            left++;
14            right--;
15        }
16        return new String(a);
17    }
18}