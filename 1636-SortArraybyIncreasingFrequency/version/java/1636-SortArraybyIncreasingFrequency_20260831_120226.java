// Last updated: 8/31/2026, 12:02:26 PM
1class Solution {
2    public int[] frequencySort(int[] nums) {
3        HashMap<Integer, Integer> map=new HashMap<>();
4        for(int num:nums){
5            map.put(num,map.getOrDefault(num,0)+1);
6        }
7        Integer []arr=new Integer[nums.length];
8        for(int i=0;i<nums.length;i++){
9            arr[i]=nums[i];
10        }
11        Arrays.sort(arr,(a,b) -> {
12            if(map.get(a)!=map.get(b)){
13                return map.get(a)-map.get(b);
14            }
15            return b-a;
16        });
17        for(int i=0;i<nums.length;i++){
18            nums[i]=arr[i];
19        }
20        return nums;
21    }
22}