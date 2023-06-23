import java.io.Console;

public class Book {
    private int id;
    private String name;
    private String author;
    private int pageCount;

    public Book(int id, String name, String author, int pageCount) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.pageCount = pageCount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void ShowDetails()
    {
        Print(toString());
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n" + "Name: " + name + "\n" +"Author: " + author + "\n" +"PageCount : " + pageCount;
    }



    private void Print(Object msg)
    {
        System.out.println(msg);
    }
}
