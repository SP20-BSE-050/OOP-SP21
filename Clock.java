
package lab9_q1;


public class Clock {
	 
    String hours, minutes, seconds;
    
   
    public Clock(String time_in_hour, String time_in_minutes, String time_in_seconds){
        
        this.hours = time_in_hour;
        this.minutes = time_in_minutes;
        this.seconds = time_in_seconds;
    }
   
    public void display(){
        System.out.println(this.hours+":"+this.minutes+":"+this.seconds);
    }
}


    
