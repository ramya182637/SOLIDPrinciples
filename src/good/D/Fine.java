package good.D;

public class Fine implements FineInterface 
{
	//amount to be charged per day for return
    private static final double FINE_PER_DAY = 2.0;
    //method to calculate the fine if the book is returned after due date or return period by no of late days
    public double calculateFine(User user, int lateDays)
    {
        double fine = lateDays * FINE_PER_DAY;
        System.out.println("Calculating fine for user: " + user.getUsername() + ". Late days: " + lateDays + ". Fine: " + fine);
        return fine;
    }
}
