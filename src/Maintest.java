public class Maintest {
    public static void main(String[] args) throws Exception {
        Day day1= new Day(15,8 , 2003);
        System.out.println(day1);
        int n=20;
        Author author1= new Author("Nghia", day1);

        Book book1= new Book("Lam Giau Khong Kho", 2000, 1988, author1 );
        Book book2= new Book("Tra May", 3000, 1977, author1);
        System.out.println(book1);
        System.out.println(book1.getNamebook());
        System.out.println(author1.getNameauthor());

        System.out.println("Check book same year? "+ book1.ChecksameYear(book2) );
        System.out.println("Price of "+book2.getNamebook() +" after discount:"+book2.PriceAfterDiscount(20)+ "$");
    }
}
