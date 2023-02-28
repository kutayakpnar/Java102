import java.awt.geom.Arc2D;
import java.util.Date;

public class Book implements Comparable {
    private String name;
    private int pageNumber;
    private String author;
    private double publishedYear;

    public Book(String name, int pageNumber, String author, double publishedYear) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(double publishedYear) {
        this.publishedYear = publishedYear;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
