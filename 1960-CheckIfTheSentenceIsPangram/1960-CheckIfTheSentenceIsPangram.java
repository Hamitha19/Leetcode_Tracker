// Last updated: 7/14/2026, 2:05:25 PM
class Solution {
    public boolean checkIfPangram(String sentence) {
       boolean flag = true;
       for(int i =97; i <=122; i++){

           if(!sentence.contains(String.valueOf((char)i))){
            flag = false;
            break;
           }
       }
      return flag; 
    }
}