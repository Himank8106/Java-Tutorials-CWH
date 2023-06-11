package JavaCWH;
import java.util.Scanner;

class library{
    String[] books;
    int noOfBooks;
    library(){
        this.books = new String[100];
        this.noOfBooks = 0;
    }

    void addBook(String book){
        this.books[noOfBooks] = book;
        noOfBooks++;
        System.out.println("The book \""+ book +"\" has been added!!");
    }

    void showAvailableBook(){
        System.out.println("Available Books are: ");
        for (String book: this.books) {
            if (book == null){
                continue;
            }
            System.out.println("* "+book);
        }
    }

//    void issueBook(String book){
//        for (int i=0; i<this.books.length; i++){
//            if(this.books[i].equals(book)){
//                if (this.books[1].equals(book) || this.books[2].equals(book)){
//                    continue;
//                }
//                System.out.println("The book \""+book+"\" has been issued!!");
//                this.books[i] = null;
//                return;
//            }
//             System.out.println("The book does not exist in library!!");
//        }
//    }

    void issueBook(String book){
        for(int i = 0;i<this.books.length; i++){
            if (this.books[i].equalsIgnoreCase(book)){
                System.out.println("The book \""+book+"\" has been issued!!");
                books[i]=null;
                if(books[i] == null){
                    continue;
                }
            }
            else {
                System.out.println("This book does not exist in library!!");
            }
            return;
        }
    }

    void returnBook(String book){
        addBook(book);
    }
}

public class Lec51_Exercise4_BookLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        library l = new library();
        System.out.print("Enter book name: ");
        l.addBook(sc.nextLine());
        l.addBook("let us C");
        l.addBook("Java");
        l.showAvailableBook();
        System.out.print("Enter the book name you want to issue: ");
        l.issueBook(sc.nextLine());
        l.showAvailableBook();
        System.out.print("Enter the book name you want to return: ");
        l.returnBook(sc.nextLine());
        l.showAvailableBook();
    }
}
