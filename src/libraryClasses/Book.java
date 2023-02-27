package libraryClasses;

/**
 * 
 *      +--------------------------+
 *      |                          |
 *      |  @author BenjaminFisico! |
 *      |                          |
 *      +--------------------------+
 * 
 *  This Class contains all books attributes.
 * 
 **/
public class Book {
    private String title,author;
    private int pags;

    // Empty constructor.
    public Book() {
    }
    
    //constructor with all attributes
    public Book(String title, String author, int pags) {
        this.title = title;
        this.author = author;
        this.pags = pags;
    }
    
    // --- Getters & setters ---

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPags() {
        return pags;
    }

    public void setPags(int pags) {
        this.pags = pags;
    }
    
}
