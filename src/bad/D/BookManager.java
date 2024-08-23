package bad.D;

import java.util.Date;

public class BookManager
{
	// Method to issue a book to a user
	 public void issueBook(User user, Book book, Date issueDate) 
	 {
	    System.out.println("Issuing book: " + book.getTitle() + " to user: " + user.getUsername() + " on " + issueDate);
	 // Update issued books in the library database
	    LibraryDatabase database = new LibraryDatabase();
	    database.updateIssuedBooks(user, book);
	 }
	// Method to return a book from a user
	 public void returnBook(User user, Book book, Date returnDate) 
	 {
	     System.out.println("Returning book: " + book.getTitle() + " from user: " + user.getUsername() + " on " + returnDate);
	     // Update returned books in the library database
	     LibraryDatabase database = new LibraryDatabase();
	     database.updateReturnedBooks(user, book);
	 }
}
