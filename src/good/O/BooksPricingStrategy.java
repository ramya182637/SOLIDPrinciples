package good.O;

public class BooksPricingStrategy implements PricingStrategy
{
	@Override
    public double calculateDiscount(double price) 
	{
        return price * 0.15;
    }
    @Override
    public double calculateHST(double price) 
    {
        return price * 0.05;
    }
    @Override
    public double calculateGST(double price) 
    {
        return price * 0.05;
    }
}
