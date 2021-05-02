
package lab9_q1;


public class ClockExtended extends Clock{
	 public ClockExtended(String time_in_hours, String time_in_minutes, String time_in_seconds){
	        super(time_in_hours, time_in_minutes, time_in_seconds);
	    }
	        
	    public void display(){
	        
	        System.out.println("Time in Hour(24) Format= ");
	        super.display();
	        System.out.println("Time in Hour(12) Format= ");
	        
	        int h1 = (int)hours.charAt(0) - '0';
	        int h2 = (int)hours.charAt(1)- '0';
	        int intohour = h1 * 10 + h2;
	        String mode;
	        if(intohour < 12)
	            mode="AM";
	        else
	            mode="PM";
	        intohour %= 12;
	        if (intohour == 0) {
	            System.out.print("12");
	            System.out.print(" :"+minutes+" :"+seconds);
	        }
	        else{
	            System.out.print(intohour);
	            System.out.print(":"+minutes+":"+seconds);
	        }
	        System.out.println(" "+mode);
	    }
	}

