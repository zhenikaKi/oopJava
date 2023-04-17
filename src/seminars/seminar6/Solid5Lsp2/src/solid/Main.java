package seminars.seminar6.Solid5Lsp2.src.solid;


import seminars.seminar6.Solid5Lsp2.src.solid.lsp.FactoryOrder;
import seminars.seminar6.Solid5Lsp2.src.solid.lsp.Orderable;

public class Main {
    public static void main(String[] args) {
        FactoryOrder creator = new FactoryOrder();
        OrderCalculator calculator = new OrderCalculator();
        calculator.add(creator.create(3, 2, false));
        calculator.add(creator.create(1, 3, true));

        for (Orderable order : calculator) {
            System.out.println(order);
        }

        System.out.printf("Сумма заказа %d", calculator.calcAmount());
    }
}
