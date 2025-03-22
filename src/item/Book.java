package item;

public class Book extends Item{
    private int pages;
    protected String author;

    public Book(){ 
        super(); 
    }
    public Book(String name, double cost, String author){ 
        super(name, cost); 
        this.author = author; 
    }

    @Override
    public String getType(){ 
        return "Book"; 
    }
    public String details(){ 
        return info(); 
    }
    public String details(boolean withAuthor){ 
        if (withAuthor) {
            return info() + " by " + author;
        } else {
            return info();
        }
    }
}
