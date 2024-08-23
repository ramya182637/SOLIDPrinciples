package good.O;

public class ElectronicsPricingStrategy implements PricingStrategy 
{
	@Override
    public double calculateDiscount(double price) {
        return price * 0.1;
    }

    @Override
    public double calculateHST(double price) {
        return price * 0.15;
    }

    @Override
    public double calculateGST(double price) {
        return price * 0.10;
    }
}
