package homework1;

/** Варианты напитков для кофемашины */
public enum DrinkType {
	ESPRESSO("Эспрессо", 100),
	LATTE("Латте", 300),
	CAPPUCCINO("Капучино", 220),
	AMERICANO("Американо", 200);

	private final String name;

	private final float price;

	DrinkType(String name, float price) {
		this.name = name;
		this.price = price;
	}

	/** Получить имя напитка */
	public String getName() {
		return name;
	}

	/** Получить цену напитка за порцию */
	public float getPrice() {
		return price;
	}
}
