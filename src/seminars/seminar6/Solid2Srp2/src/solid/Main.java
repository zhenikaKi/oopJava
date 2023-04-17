package seminars.seminar6.Solid2Srp2.src.solid;


import seminars.seminar6.Solid2Srp2.src.solid.repository.JsonSaver;
import seminars.seminar6.Solid2Srp2.src.solid.srp.models.Order;
import seminars.seminar6.Solid2Srp2.src.solid.srp.views.ConsoleInput;

public class Main {
    public static void main(String[] args) {
        ConsoleInput input = new ConsoleInput();
        System.out.println("Введите заказ:");
        Order order = input.inputFromConsole();
        JsonSaver saver = new JsonSaver();
        saver.saveToJson(order);
    }
}
