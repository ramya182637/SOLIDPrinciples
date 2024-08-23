package bad.D;

public class Book 
{
	//variables for book title and author
	private String title;
    private String author;
    //constructor
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
    //getters and setters
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
}
