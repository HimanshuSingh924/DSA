class Solution {
    public String trafficSignal(int timer) {
        if(0 == timer) 
            return "Green";

        else if(30 == timer) 
            return "Orange";
        
        else if(timer > 30 && timer <= 90) 
            return "Red";
        
        else 
            return "Invalid";
    }
}