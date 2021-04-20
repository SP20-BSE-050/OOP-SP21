
public class playing_tape extends Book_publish_lab08_Q1 {
    private int time_in_minute;

    public playing_tape(float price, String title_of_tape, int time_in_minute){
        super(price, title_of_tape);
        this.time_in_minute = time_in_minute;
    }

    public void setTime(int time_in_minute) {
        this.time_in_minute = time_in_minute;
    }
    public int getTime(){
        return time_in_minute;
    }

    public void display(){
        System.out.println("\nTAPE PUBLICATION; " + "\nTAPE TITLE ="+title_of_book + "\nTAPE PRICE = "+price_of_book + "\nTAPE TIME IN MINUTES = "+time_in_minute);
    }


}


