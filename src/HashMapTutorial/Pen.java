package HashMapTutorial;

import java.util.Objects;

public class Pen {
    String colour;
    int price;

    public Pen(String colour, int price) {
        this.colour = colour;
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, price);
    }

    @Override
    public boolean equals(Object o) {
        Pen p=(Pen)o;
        boolean check=this.price==p.price&&this.colour.equals(p.colour);
        return check;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
