package homework1.drinks;

import homework1.DrinkType;

public class Espresso extends Drink {

	public Espresso() {
		this(DrinkType.ESPRESSO.getName(), DrinkType.ESPRESSO.getPrice());
	}

	public Espresso(String name, float price) {
		super(name, 40, price, 8);
	}
}
