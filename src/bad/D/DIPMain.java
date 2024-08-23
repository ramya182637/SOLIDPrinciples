package bad.D;

import java.util.Date;
import java.util.Scanner;

public class DIPMain 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the User Name : ");
		// Creating User object directly
		User user = new User(sc.next());
		
		System.out.println("Enter the Book name and its Author :");
		// Creating Book objects directly
        Book book = new Book(sc.next(),sc.next());
        
        // Direct instantiation of BookManager, FineManager, Notification, and Search
        BookManager bookManager = new BookManager();
        Date issueDate = new Date();
        bookManager.issueBook(user, book, issueDate);
        // the default return date is 7 days later
        Date returnDate = new Date(System.currentTimeMillis() + 7 * 24 * 60 * 60 * 1000L); 
        bookManager.returnBook(user, book, returnDate);
        
        //notification demo
        Notification notification = new Notification();
        System.out.println("Enter the message to send as notification :");
        notification.sendNotification(user,sc.next());
        
        //Fine calculation and display
        FineManager fineManager = new FineManager();
        System.out.println("Enter no of late days : ");
        int lateDays = sc.nextInt();
        double fine = fineManager.calculateFine(user, lateDays);
        System.out.println("Fine for " + lateDays + " late days: " + fine);
       
        //search demo
        Search search = new Search();
        System.out.println("Enter book name to search : ");
        search.searchBook(sc.next());
        sc.close();
	}
}
