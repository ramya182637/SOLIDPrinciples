package good.D;

import java.util.Date;
import java.util.Scanner;

public class DIPMainGood 
{
	public static void main(String[] args) 
	{
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the User Name : ");
		     // Creating User object directly
		    User user = new User(sc.next());
		    System.out.println("Enter the Book name and its Author :");
		   // Creating book object directly
	        Book book = new Book(sc.next(), sc.next());
	        //instantiation of BookManager, FineManager, Notification, and Search through interfaces
	        LibraryDatabaseInterface database = new LibraryDatabase();
	        BookManagerInterface bookManager = new BookManager(database);
	        Date issueDate = new Date();
	        bookManager.issueBook(user, book, issueDate);
            //default retrun date for book is after 7 days
	        Date returnDate = new Date(System.currentTimeMillis() + 7 * 24 * 60 * 60 * 1000L); 
	        bookManager.returnBook(user, book, returnDate);
            //notification demo
	        NotificationInterface notification = new Notification();
	        System.out.println("Enter message to send as notification to user :");
	        notification.sendNotification(user,sc.next());
           //fine calculation demo
	        FineInterface fineManager = new Fine();
	        System.out.println("Enter no of late days : ");
	        int lateDays = sc.nextInt();
	        double fine = fineManager.calculateFine(user, lateDays);
	        System.out.println("Fine for " + lateDays + " late days: " + fine);
            //search demo
	        SearchInterface search = new Search();
	        System.out.println("Enter the book name to search : ");
	        search.searchBook(sc.next());
            sc.close();
	}
}
