package good.D;

public class LibraryDatabase implements LibraryDatabaseInterface 
{
	//method to update issued books into the databse
    public void updateIssuedBooks(User user, Book book) 
    {
        System.out.println("Database updated with issued book: " + book.getTitle() + " for user: " + user.getUsername());
    }
    //method to update the returned books into the database
    public void updateReturnedBooks(User user, Book book)
    {
        System.out.println("Database updated with returned book: " + book.getTitle() + " for user: " + user.getUsername());
    }
}
