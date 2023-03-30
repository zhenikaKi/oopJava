package homeworks.homework1.drinks;

import homeworks.homework1.DrinkType;

public class Americano extends Drink {

	/** Объем воды в граммах для приготовления 1 порции */
	private final int waterVolume = 100;

	public Americano() {
		super(DrinkType.AMERICANO.getName(), 80, DrinkType.AMERICANO.getPrice(), 16);
	}

	@Override
	public int getWaterVolume() {
		return waterVolume;
	}
}
