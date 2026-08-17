// Last updated: 8/17/2026, 3:16:34 PM
1class Solution {
2    public String destCity(List<List<String>> paths) {
3        HashSet<String> set=new HashSet<>();
4        for(List<String> path:paths){
5            set.add(path.get(0));
6        }
7        for(List<String> path:paths){
8            if(!set.contains(path.get(1))){
9                return path.get(1);
10            }
11        }
12        return "";
13    }
14}