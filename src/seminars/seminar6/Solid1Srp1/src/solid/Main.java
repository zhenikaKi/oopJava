package seminars.seminar6.Solid1Srp1.src.solid;

import seminars.seminar6.Solid1Srp1.src.solid.srp.Area;
import seminars.seminar6.Solid1Srp1.src.solid.srp.Point;
import seminars.seminar6.Solid1Srp1.src.solid.srp.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        Area area = new Area(square.getSide());
        square.setZoom(2);
        System.out.printf("Площадь фигуры: %d \n", area.getArea());
        square.draw();
    }
}
