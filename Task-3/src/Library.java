import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;

    public Library(){
        this.books= new ArrayList<>();
    }
    //add method to add a book in the library
    public void addBook(Book book){
        books.add(book);
        System.out.println("Books added to the library:");
    }
    //remove method to remove  a book from the library
    public void removeBook(int bookID){
        for(Book book: books){
            if(book.getBookID() == bookID){
                books.remove(book);
                System.out.println("Book removed from the library::");
                return;
            }
        }
        System.out.println("Book ID"  + bookID + "Book ID not found in the library::");


    }
    //search method to search for a book id
    public void searchBook(int bookID){
        for(Book book: books){
            if(book.getBookID()== bookID){
                book.displayBookInformation();
                return;
            }

        }
        System.out.println("Book ID"  + bookID +  "Book ID not found in the library::");
    }
    // Method to display all books in the library
 public void displayBooks(){
        if(books.isEmpty()){
            System.out.println("No Books in library::");
        }else {
            System.out.println("Books in the library::");
            for(Book book: books){
                book.displayBookInformation();
            }

        }


 }
}
