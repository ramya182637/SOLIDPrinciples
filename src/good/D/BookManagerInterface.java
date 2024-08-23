package good.D;

import java.util.Date;

public interface BookManagerInterface 
{
	void issueBook(User user, Book book, Date issueDate);
    void returnBook(User user, Book book, Date returnDate);

}
