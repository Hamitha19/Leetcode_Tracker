// Last updated: 7/14/2026, 2:06:54 PM
class Solution {
    public int findComplement(int num) {
        String binary=Integer.toBinaryString(num);
        String res="";
                for(int i=0;i<binary.length();i++){
                    if(binary.charAt(i)=='1'){
                        res+='0';
                    }else{
                        res+='1';
                    }
            }
        int dec=Integer.parseInt(res,2);
        return dec;
    }
}