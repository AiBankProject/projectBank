package Serialize;

import java.io.Serializable;

public class Book implements Serializable {
    private String name;
    private  int code;
    private int pages;

    public Book(String name, int code, int pages) {
        this.name = name;
        this.code = code;
        this.pages = pages;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public int getPages() {
        return pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", pages=" + pages +
                '}';
    }
}
