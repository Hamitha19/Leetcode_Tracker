// Last updated: 8/3/2026, 12:22:04 PM
1class Solution {
2    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
3        if(start>destination){
4            int temp=start;
5            start=destination;
6            destination=temp;
7        }
8        int total=0;
9        for(int i=0;i<distance.length;i++){
10            total+=distance[i];
11        }
12        int sum=0;
13        for(int i=start;i<destination;i++){
14            sum+=distance[i];
15        }
16        int num=total-sum;
17        int fin=Math.min(sum,num);
18        return fin;
19    }
20}