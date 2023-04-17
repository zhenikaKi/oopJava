package seminars.seminar6.Solid2Srp2.src.solid.repository;


import seminars.seminar6.Solid2Srp2.src.solid.srp.models.Order;

import java.io.FileWriter;
import java.io.IOException;

public class JsonSaver {
    public void saveToJson(Order order) {
        String fileName = "seminars/seminar6/order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\""+order.getProduct()+"\",\n");
            writer.write("\"qnt\":"+order.getQnt()+",\n");
            writer.write("\"price\":"+order.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
