package homeworks.homework1.drinks;

import homeworks.homework1.DrinkType;

public class Latte extends Espresso {

	/** Объем молока в граммах для приготовления 1 порции */
	private final int milkVolume = 200;

	/** Объем сахара в граммах для приготовления 1 порции */
	private final int sugarVolume = 5;

	public Latte() {
		super(DrinkType.LATTE.getName(), DrinkType.LATTE.getPrice());
	}

	@Override
	public int getMilkVolume() {
		return milkVolume;
	}

	@Override
	public int getSugarVolume() {
		return sugarVolume;
	}
}
