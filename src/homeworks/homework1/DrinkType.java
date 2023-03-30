package homeworks.homework1;

import homeworks.homework1.drinks.*;

/** Варианты напитков для кофемашины */
public enum DrinkType implements DrinkFactory {
	ESPRESSO("Эспрессо", 100) {
		@Override
		public Drink create() {
			return new Espresso();
		}
	},

	LATTE("Латте", 300) {
		@Override
		public Drink create() {
			return new Latte();
		}
	},

	CAPPUCCINO("Капучино", 220) {
		@Override
		public Drink create() {
			return new Cappuccino();
		}
	},

	AMERICANO("Американо", 200) {
		@Override
		public Drink create() {
			return new Americano();
		}
	};

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
