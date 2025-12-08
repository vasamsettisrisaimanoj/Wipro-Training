class Book {
    static int bookCount; 
    String book;  
    String author; 
    int year;     
    Book(String book, String author, int year) {
        this.book = book;
        this.author = author;
        this.year = year;
        bookCount++; 
    }
    void displayInfo() {
        System.out.println("Book: " + book);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Book Count: " + bookCount);
    }
}
public class static{
    public static void main(String[] args) {
        Book book = new Book("wipro", "abc", 2025);
        book.displayInfo();
        System.out.println("======================");
        Book book1 = new Book("Great learning", "xyz", 2025);
        book1.displayInfo();
    }
}