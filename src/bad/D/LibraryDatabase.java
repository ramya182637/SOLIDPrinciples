package bad.D;

public class LibraryDatabase 
{
	// Method to update the database with issued books for a user
	public void updateIssuedBooks(User user, Book book) 
	{
        System.out.println("Database updated with issued book: " + book.getTitle() + " for user: " + user.getUsername());
    }

	// Method to update the database with returned books for a user
    public void updateReturnedBooks(User user, Book book) 
    {
        System.out.println("Database updated with returned book: " + book.getTitle() + " for user: " + user.getUsername());
    }

}
