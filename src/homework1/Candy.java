package homework1;

import products.Product;

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
