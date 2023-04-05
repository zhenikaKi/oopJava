package homeworks.homework3;

import homeworks.homework3.mylist.MyList;

/**
 * Создать список по аналогии LinkedList (список связанных элементов), реализовать в нем iterable интерфейс.
 * Список должен содержать элементы со ссылкой на следующий элемент
 * (если показалось мало, то реализовать ссылку и на предыдущий элемент)
 */
public class Main {
	public static void main(String[] args) {
		MyList<Integer> myList = new MyList<>();
		myList.addLast(1);
		myList.addLast(2);
		myList.addLast(3);
		myList.addFirst(0);
		myList.addFirst(-1);

		System.out.println("Прямой обход списка:");
		for (int value: myList) {
			System.out.printf("value = %s\n", value);
		}

		System.out.println("Обратный обход списка:");
		for (int value: myList.getBackIterable()) {
			System.out.printf("value = %s\n", value);
		}
	}
}
