package homeworks.homework1;

import java.util.Random;

import homeworks.homework1.drinks.Drink;

/**
 * Создать торговый кофейный автомат, напитки в автомате должны содержать следующие данные:
 * наименование, объем, температура, цена. Проинициализировать несколько напитков в классе main и торговый автомат,
 * воспроизвести логику продажи напитков. Сделать на основе ООП
 */
public class HomeWork1Main {

	public static void main(String[] args) {
		CoffeeMachine coffeeMachine = new CoffeeMachine(85, 200, 800, 300, 300);

		//готовим 10 напитков
		Random random = new Random();
		try {
			for (int count = 1; count <= 10; count++)
			{
				//определяем случайный тип напитка
				int type = random.nextInt(DrinkType.values().length);
				DrinkType drinkType = DrinkType.values()[type];

				System.out.printf("Приготовление напитка № %s (%s), температура: %s\n",
						count,
						drinkType.getName(),
						coffeeMachine.getTemperature());
				Drink drink = coffeeMachine.prepare(drinkType);
				System.out.println(drink.toString());
				System.out.println();
			}
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}

		System.out.printf("Прибыль в кофемашине: %s\n", coffeeMachine.getIncome());
	}
}
