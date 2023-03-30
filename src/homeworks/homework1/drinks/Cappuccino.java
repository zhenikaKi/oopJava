package homeworks.homework1.drinks;

import homeworks.homework1.DrinkType;

public class Cappuccino extends Espresso {

	/** Объем молока в граммах для приготовления 1 порции */
	private final int milkVolume = 25;

	public Cappuccino() {
		super(DrinkType.CAPPUCCINO.getName(), DrinkType.CAPPUCCINO.getPrice());
	}

	@Override
	public int getMilkVolume() {
		return milkVolume;
	}
}
