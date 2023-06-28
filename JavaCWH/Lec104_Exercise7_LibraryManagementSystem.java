package JavaCWH;

import java.util.ArrayList;

class Book{
    public String name, author;
    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString(){
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class Library{
    public ArrayList<Book> books;
    public Library(ArrayList<Book> books){
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("The book has been added to the library");
        this.books.add(book);
    }
    public void issueBook(Book book, String issued_to){
        System.out.println("The book has been issued from the library to " + issued_to);
        this.books.remove(book);
    }
    public void returnBook(Book book){
        System.out.println("The book has been returned");
        this.books.add(book);
    }
}

public class Lec104_Exercise7_LibraryManagementSystem {
    public static void main(String[] args) {
        ArrayList<Book> b = new ArrayList<>();

        Book b1 = new Book("Book1", "Author1");
        b.add(b1);
        Book b2 = new Book("Book2", "Author2");
        b.add(b2);
        Book b3 = new Book("Book3", "Author3");
        b.add(b3);
        Book b4 = new Book("Book4", "Author4");
        b.add(b4);

        Library l = new Library(b);
        l.addBook(new Book("Book5", "Author5"));
        System.out.println(l.books);
        l.issueBook(b3, "Himank");
        System.out.println(l.books);
    } 
}
