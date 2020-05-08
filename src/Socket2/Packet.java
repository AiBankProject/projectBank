package Socket2;

import java.io.Serializable;
import java.util.ArrayList;

//MessageData ili PackageData
public class Packet implements Serializable {
    private int bookid;
    private Book book;
    private ArrayList<Book> books;
    private String code;

    public Packet(ArrayList<Book> books) {
        this.books = books;
    }

    public Packet(Book book, String code) {
        this.book = book;
        this.code = code;
    }

    public Packet(int bookid, String code) {
        this.bookid = bookid;
        this.code = code;
    }

    public Packet(String code) {
        this.code = code;
    }

    public Packet() {
    }

    public int getBookid() {
        return bookid;
    }

    public Book getBook() {
        return book;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public String getCode() {
        return code;
    }
}
