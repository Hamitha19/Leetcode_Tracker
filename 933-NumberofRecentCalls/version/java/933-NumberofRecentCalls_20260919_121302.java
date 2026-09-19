// Last updated: 9/19/2026, 12:13:02 PM
1class RecentCounter {
2    Queue<Integer> q=new LinkedList<>();
3
4    public RecentCounter() {
5        
6    }
7    
8    public int ping(int t) {
9        q.offer(t);
10        while(q.peek()<(t-3000)){
11            q.poll();
12        }
13        return q.size();
14    }
15}
16
17/**
18 * Your RecentCounter object will be instantiated and called as such:
19 * RecentCounter obj = new RecentCounter();
20 * int param_1 = obj.ping(t);
21 */