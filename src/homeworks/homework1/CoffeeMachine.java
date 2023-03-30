package homeworks.homework1;

import homeworks.homework1.drinks.Drink;

/** Кофемашина с напитками */
public class CoffeeMachine {

	private float temperature;
	private int coffeeVolume;
	private int milkVolume;
	private int waterVolume;
	private int sugarVolume;
	private int income = 0;

	/**
	 * Инициализировать кофемашину.
	 * @param temperature Температура напитков.
	 * @param coffeeVolume Объем молотого кофе в кофемашине в граммах.
	 * @param milkVolume Объем молока в кофемашине в граммах.
	 * @param waterVolume Объем воды в кофемашине в граммах.
	 * @param sugarVolume Объем сахара в кофемашине в граммах.
	 */
	public CoffeeMachine(float temperature, int coffeeVolume, int milkVolume, int waterVolume, int sugarVolume) {
		this.temperature = temperature;
		this.coffeeVolume = coffeeVolume;
		this.milkVolume = milkVolume;
		this.waterVolume = waterVolume;
		this.sugarVolume = sugarVolume;
	}

	/**
	 * Приготовить напиток.
	 * @param type Тип напитка.
	 * @return Готовый напиток или ошибка, если не хватает ингредиентов для приготовления.
	 */
	public Drink prepare(DrinkType type) {
		//создаем объект напитка
		Drink drink = type.create();

		//уменьшаем количество ингредиентов
		StringBuilder errors = recalculateBalance(drink);

		//выдаем напиток
		if (errors.length() == 0) {
			return drink;
		}

		throw new RuntimeException(errors.toString());
	}

	/** Получить прибыль кофемашины */
	public int getIncome() {
		return income;
	}

	/** Получить температуру напитка */
	public float getTemperature() {
		return temperature;
	}

	/**
	 *
	 * Пересчитать остатки в кофемашине.
	 * @param drink Напиток, который нужно приготовить.
	 * @return Список ошибок, если были при пересчете.
	 */
	private StringBuilder recalculateBalance(Drink drink) {
		if (drink == null) {
			return new StringBuilder("Не инициализирован напиток; ");
		}

		//проверяем остатки
		StringBuilder errors = validateDrink(drink);

		//обновляем остатки
		if (errors.length() == 0) {
			coffeeVolume -= drink.getCoffeeVolume();
			milkVolume -= drink.getMilkVolume();
			waterVolume -= drink.getWaterVolume();
			sugarVolume -= drink.getSugarVolume();
			income += drink.getPrice();
		}
		return errors;
	}

	/**
	 * Выполнить проверку наличие ингредиентов для напитка.
	 * @param drink Напиток, для которого нужно проверить ингредиенты.
	 * @return Список недостающих ингредиентов, которых не хватает. Пустой список означает, что ингредиентов хватает.
	 */
	private StringBuilder validateDrink(Drink drink) {
		StringBuilder result = new StringBuilder();
		if (coffeeVolume - drink.getCoffeeVolume() < 0) {
			result.append("Не хватает кофе для приготовления; ");
		}
		if (milkVolume - drink.getMilkVolume() < 0) {
			result.append("Не хватает молока для приготовления; ");
		}
		if (waterVolume - drink.getWaterVolume() < 0) {
			result.append("Не хватает воды для приготовления; ");
		}
		if (sugarVolume - drink.getSugarVolume() < 0) {
			result.append("Не хватает сахара для приготовления; ");
		}
		return result;
	}
}
