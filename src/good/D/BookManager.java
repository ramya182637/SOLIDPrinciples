package good.D;

import java.util.Date;

public class BookManager implements BookManagerInterface 
{
    private final LibraryDatabaseInterface database;
    // Constructor to initialize with a database implementation
    public BookManager(LibraryDatabaseInterface database) 
    {
        this.database = database;
    }
    // Method to issue a book to a user
    public void issueBook(User user, Book book, Date issueDate)
    {
        System.out.println("Issuing book: " + book.getTitle() + " to user: " + user.getUsername() + " on " + issueDate);
        // Updating issued books using injected database implementation
        database.updateIssuedBooks(user, book);
    }
    // Method to return a book from a user
    public void returnBook(User user, Book book, Date returnDate) 
    {
        System.out.println("Returning book: " + book.getTitle() + " from user: " + user.getUsername() + " on " + returnDate);
        // Updating returned books using injected database implementation
        database.updateReturnedBooks(user, book);
    }
}