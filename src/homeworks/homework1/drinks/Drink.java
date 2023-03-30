package homeworks.homework1.drinks;

/** Основной класс с описанием напитка */
public abstract class Drink {

	private final String name;
	private final int volume;
	private final float price;
	private final int coffeeVolume;

	/**
	 * Инициализация напитка.
	 * @param name Название напитка.
	 * @param volume Объем напитка 1 порции, в миллилитрах.
	 * @param price Цена напитка.
	 * @param coffeeVolume Объем молотого кофе в граммах для приготовления 1 порции.
	 */
	public Drink(String name, int volume, float price, int coffeeVolume) {
		this.name = name;
		this.volume = volume;
		this.price = price;
		this.coffeeVolume = coffeeVolume;
	}

	/** Получить название напитка */
	public String getName() {
		return name;
	}

	/** Получить объем напитка 1 порции в миллилитрах */
	public int getVolume() {
		return volume;
	}

	/** Получить цену напитка */
	public float getPrice() {
		return price;
	}

	/** Получить объем молотого кофе в граммах для приготовления 1 порции */
	public int getCoffeeVolume() {
		return coffeeVolume;
	}

	/** Получить объем молока в граммах для приготовления 1 порции */
	public int getMilkVolume() {
		return 0;
	}

	/** Получить объем сахара в граммах для приготовления 1 порции */
	public int getSugarVolume() {
		return 0;
	}

	/** Получить объем воды в граммах для приготовления 1 порции */
	public int getWaterVolume() {
		return 0;
	}

	@Override
	public String toString() {
		return String.format("Напиток \"%s\" объемом \"%s\" готов", getName(), getVolume());
	}
}
