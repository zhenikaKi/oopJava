package seminars.seminar1;

import homeworks.homework1.Candy;
import seminars.seminar1.products.Chocolate;
import seminars.seminar1.products.ConcentrateMilk;
import seminars.seminar1.products.Milk;
import seminars.seminar1.products.Product;
import homeworks.homework1.Tea;

public class Main {
    public static void main(String[] args) {
        VendingMachine mart = new VendingMachine();
        mart.addProduct(new Product("bread", 35, 10))
                .addProduct(new Milk("moloko", 50, 2))
                .addProduct(new Product("cheese", 100.2, 5))
                .addProduct(new ConcentrateMilk("Советская", 150, 1))
                .addProduct(new Chocolate("Аленка", 35.20,3, "Ореховый"))
                .addProduct(new Tea("БрукБонд", 74,10, "с лимоном"))
                .addProduct(new Candy("Сникерс", 35,30));

        System.out.println("До продажи");
        System.out.println(mart);
        PrintSell(mart,"moloko");
        PrintSell(mart,"moloko");
        PrintSell(mart,"moloko");
        System.out.println();
        System.out.println("После продажи");
        System.out.println(mart);
        System.out.println();
        PrintSell(mart,"Фиговина");
        System.out.println(mart);
    }

    public static void PrintSell (VendingMachine machine, String nameProd){
        try{
            System.out.println(machine.sell(nameProd));
        } catch (Exception e) {
            System.out.println("Товар не найден");
        }
    }
}