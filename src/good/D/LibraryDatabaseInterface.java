package good.D;

public interface LibraryDatabaseInterface 
{
	 void updateIssuedBooks(User user, Book book);
	 void updateReturnedBooks(User user, Book book);
}
