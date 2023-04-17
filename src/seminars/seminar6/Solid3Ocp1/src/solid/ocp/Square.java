package seminars.seminar6.Solid3Ocp1.src.solid.ocp;

public class Square  implements Shape {
    private int side;
    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double area() {
        return Math.pow(this.getSide(), 2);
    }
}
