package seminars.seminar6.Solid3Ocp1.src.solid;

import seminars.seminar6.Solid3Ocp1.src.solid.ocp.RightTriangle;
import seminars.seminar6.Solid3Ocp1.src.solid.ocp.Shape;
import seminars.seminar6.Solid3Ocp1.src.solid.ocp.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Square(4));
        double sumArea = 0;
        for (Shape shape : shapes) {
            sumArea += shape.area();
        }

        System.out.printf("Сумма площадей фигур равна %f \n", sumArea);
    }
}
