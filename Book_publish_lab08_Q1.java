public class Book_publish_lab08_Q1 {
    protected float price_of_book;
    protected String title_of_book;

    public Book_publish_lab08_Q1(){

    }
    public Book_publish_lab08_Q1(float price_of_book, String title_of_book) {
        this.price_of_book = price_of_book;
        this.title_of_book = title_of_book;
    }

    public void setPriceOfBook(float price_of_book){
        this.price_of_book = price_of_book;
    }
    public float getPriceOfBook(){
        return price_of_book;
    }

    public void setTitleOfBook(String title_of_book){
        this.title_of_book = title_of_book;
    }
    public String getTitleOfBook(){
        return title_of_book;
    }



}




