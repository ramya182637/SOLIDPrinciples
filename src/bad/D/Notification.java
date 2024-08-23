package bad.D;

public class Notification
{
	//method to send notifications to user with message
	//for example sending notification while returning /issuing or before due date to return book or remainders
	public void sendNotification(User user, String message) 
	{
        System.out.println("Sending notification to user: " + user.getUsername() + " with message: " + message);
    }

}
