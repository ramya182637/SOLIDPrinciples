package good.O;

public interface PricingStrategy 
{
	double calculateDiscount(double price);
    double calculateHST(double price);
    double calculateGST(double price);
}
