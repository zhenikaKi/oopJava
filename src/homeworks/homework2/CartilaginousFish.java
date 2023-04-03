package homeworks.homework2;

public class CartilaginousFish extends BoneFish {

    public CartilaginousFish(String name, int speed) {
        super(name, speed);
    }

    @Override
    public String feed (){
        return "Мелкая рыбка";
    }
}
