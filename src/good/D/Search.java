package good.D;

public class Search implements SearchInterface 
{
	//method to search a book in the library database 
    public void searchBook(String query)
    {
        System.out.println("Searching for book with query: " + query);
    }
}
