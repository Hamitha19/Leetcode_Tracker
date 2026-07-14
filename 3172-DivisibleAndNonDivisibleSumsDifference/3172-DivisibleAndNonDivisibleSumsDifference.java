// Last updated: 7/14/2026, 2:04:39 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        int not=0;
        int add=0;
        for(int i=1;i<=n;i++){
            if(i%m!=0){
                not+=i;
            }else{
                add+=i;
            }
        }
        int tot=not-add;
        return tot;
    }
}