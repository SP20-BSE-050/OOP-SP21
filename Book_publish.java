
public class Book_publish extends Book_publish_lab08_Q1 {
    private int pages;

    public Book_publish(float price_of_book, String title_of_book, int pages){
        super(price_of_book, title_of_book);
        this.pages = pages;
    }

    public void setNumberOfPages(int pages){
        this.pages = pages;
    }
    public int getNumberOfPages(){
        return pages;
    }

    public void display(){
        System.out.println("BOOK PUBLICATION;\n"+"BOOK TITLE= "+title_of_book + "\nBOOK PRICE= "+price_of_book + "\nPAGE NUMBERS= "+pages);
    }

}

