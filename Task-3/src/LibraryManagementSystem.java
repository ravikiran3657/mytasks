public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library lib=new Library();

        //add some books to the library
        Book book1=new Book(1002,"Guvi Java book","jhon",true);
        Book book2= new Book(1003,"Core java","lee",true);

        lib.addBook(book1);
        lib.addBook(book2);
       // to display the all books
       lib.displayBooks();
         //remove a book
        //lib.removeBook(1001);
        //search a book
        lib.searchBook(1001);
    }
}
