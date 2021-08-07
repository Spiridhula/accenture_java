package accenturejava.model;

public class Order {
    private String user;
    private String drink;
    private String size;

    public Order() {
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDrink() {
        return this.drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;

    }

    @Override
    public String toString() {
        return "Order{" +
                "user='" + user + '\'' +
                ", drink='" + drink + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
