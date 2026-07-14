// Last updated: 7/14/2026, 2:06:29 PM
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int num=i;
            int temp=i;
            boolean found=true;
            while(temp>0){
                int digit=temp%10;
                if(digit==0 || num%digit!=0){
                    found=false;
                    break;
                }
                temp/=10;
            }
            if(found){
                list.add(num);

            }
        }
        return list;
    }
}