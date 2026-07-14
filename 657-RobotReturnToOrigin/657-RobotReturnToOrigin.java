// Last updated: 7/14/2026, 2:06:35 PM
class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                x++;
            }else if(moves.charAt(i)=='D'){
                x--;
            }else if(moves.charAt(i)=='L'){
                y++;
            }else if(moves.charAt(i)=='R'){
                y--;
            }
        }
        if(x==0 && y==0){
            return true;
        }
        return false;
    }
}