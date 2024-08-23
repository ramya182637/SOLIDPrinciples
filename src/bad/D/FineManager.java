package bad.D;

public class FineManager 
{
	private static final double FINE_PER_DAY = 2.0;
	//method to calculate fine if user returns book after return date or lately after return date
	// This method directly depends on the concrete implementation of User
    public double calculateFine(User user, int lateDays) 
    {
        double fine = lateDays * FINE_PER_DAY;
        System.out.println("Calculating fine for user: " + user.getUsername() + ". Late days: " + lateDays + ". Fine: " + fine);
        return fine;
    }
}
