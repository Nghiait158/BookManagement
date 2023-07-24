public class Book {
    private String namebook;
    private double pricebook;
    private int publishingyear;
    private Author author ;
       
    // constructor---------
    public Book(){
    }
    public Book(String namebook, double pricebook, int publishingyear, Author author){
        this.namebook= namebook;
        this.pricebook= pricebook;
        this.publishingyear=publishingyear;
        this.author=author;
    }
    //  constructor---------- 
    // getter and setter-------------
    public void setNamebook(String namebook){
        this.namebook=namebook;
    }
    public String getNamebook(){
        return namebook;
    }
    public void setPricebook( double pricebook){
        this.pricebook=pricebook;
    }
    public double getPricebook (){
        return pricebook;
    }
    public void setPublishingyear(int publishingyear){
        this.publishingyear=publishingyear;
    }
    public int getPublishingyear(){
        return publishingyear;
    }
    // end of getter and setter 
    public String toString(){
        return " Book's name: "+this.namebook+"  Price: "+ this.pricebook+"$"+"  Year: "+ this.publishingyear+"  Aut    hor:" +this.author;
    }

    public boolean ChecksameYear(Book book){
        return this.publishingyear== book.publishingyear;
    }

    public double PriceAfterDiscount(double percent){
        return this.pricebook+ (this.pricebook*(percent/100));
    }
}
