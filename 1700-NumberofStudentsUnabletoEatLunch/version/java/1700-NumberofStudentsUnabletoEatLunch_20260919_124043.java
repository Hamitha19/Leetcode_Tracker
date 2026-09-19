// Last updated: 9/19/2026, 12:40:43 PM
1class Solution {
2    public int countStudents(int[] students, int[] sandwiches) {
3        Queue<Integer> q=new LinkedList<>();
4        for(int i=0;i<students.length;i++){
5            q.offer(students[i]);
6        }
7        int j=0;
8        int count=0;
9        while(j<sandwiches.length && !q.isEmpty()){
10            if(q.peek()==sandwiches[j]){
11                q.poll();
12                j++;
13                count=0;
14            }else{
15                int s=q.poll();
16                q.offer(s);
17                count++;
18            }
19            if(count==q.size()){
20                break;
21            }
22        }
23        return q.size();
24    }
25}