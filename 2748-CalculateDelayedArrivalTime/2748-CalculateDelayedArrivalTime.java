// Last updated: 7/14/2026, 2:04:49 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
      int time=arrivalTime+delayedTime;
     
        if(time>=24){
            return time-24;
      }
      
        
       else{
        return time;
      }
    }
}