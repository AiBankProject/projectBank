package Serialize;

import java.io.Serializable;

public class Good implements Serializable {
    private String name;
    private int price;

    public Good() {}
    public Good(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price;
    }
}
