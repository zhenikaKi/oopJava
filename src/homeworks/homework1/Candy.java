package homeworks.homework1;

import seminars.seminar1.products.Product;

public class Candy extends Product
{

    public Candy(String name, double price, int value) {
        super(name, price, value);
    }

    @Override
    public String toString() {
        return String.format("Конфета: %s" ,super.toString());
    }
}
