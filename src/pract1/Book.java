package pract1;

public class Book
{
    private String genre;
    private int pages;
    private String author;

    public Book(String inputGenre,int inputPages,String inputAuthor)
    {
        genre=inputGenre;
        pages=inputPages;
        author=inputAuthor;
    }
    public Book(String inputGenre,int inputPages)
    {
        genre=inputGenre;
        pages=inputPages;
        author="Unknown";
    }
    public void setAuthor(String author)
    {
        this.author=author;
    }
    public String  getGenre()
    {
        return this.genre;
    }
    public int  getPages()
    {
        return this.pages;
    }
    public String  getAuthor()
    {
        return this.author;
    }
    public String toString()
    {
        return this.genre+",  pages "+this.pages+",  author "+this.author;
    }
    public String output()
    {
        return "Ball \n "+"Genre: "+this.genre+"\n Pages: "+this.pages+"\n Author: "+this.author;
    }
}
