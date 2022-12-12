import java.time.LocalDate;

public class Medicament {
    String name;
    double price;
    int quantity;
    LocalDate expirydate;

    public Medicament(String name, double price, int quantity, LocalDate expirydate) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expirydate = expirydate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(LocalDate expirydate) {
        this.expirydate = expirydate;
    }

    @Override
    public String toString() {
        return "Medicament{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", expirydate=" + expirydate +
                '}';
    }
}
