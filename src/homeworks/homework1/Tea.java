package homeworks.homework1;

import seminars.seminar1.products.Product;

public class Tea extends Product
{

    private String taste;

    public Tea(String name, double price, int value, String taste) {
        super(name, price, value);
        this.taste = taste;
    }

    @Override
    public String toString() {
        return String.format("Чай %s: %s", taste, super.toString());
    }
}
