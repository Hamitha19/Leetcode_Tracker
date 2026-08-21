// Last updated: 8/21/2026, 2:14:50 PM
1class Solution {
2    public String reformatDate(String date) {
3        String []arr=date.split(" ");
4        String day=arr[0].substring(0,arr[0].length()-2);
5        String []m={
6            "Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"
7        };
8        int month=0;
9        for(int i=0;i<12;i++){
10            if(m[i].equals(arr[1])){
11                month=i+1;
12                break;
13            }
14        }
15        return arr[2] + "-" + String.format("%02d",month) + "-" + String.format("%02d",Integer.parseInt(day));
16    }
17}