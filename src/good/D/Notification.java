package good.D;

public class Notification implements NotificationInterface 
{
	//method to send notifications to user with custom message 
	//for example notification to return books before return period or when a book requested is available to be issued
    public void sendNotification(User user, String message)
    {
        System.out.println("Sending notification to user: " + user.getUsername() + " with message: " + message);
    }
}