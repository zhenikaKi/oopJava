package homeworks.homework3.mylist;

import java.util.Iterator;

/** Список элементов, которые имеют ссылки на предыдущий и следующий элементы */
public class MyList<E> implements Iterable<E> {

	/** Самый первый элемент в списке */
	private MyListItem<E> first;

	/** Самый последний элемент в списке */
	private MyListItem<E> last;

	/** Инициализация списка */
	public MyList() {
		first = null;
		last = null;
	}

	@Override
	public Iterator<E> iterator() {
		return new CurrentIterator(first, false);
	}

	/** Получить итератор обратного направления */
	public Iterable<E> getBackIterable() {
		return () -> new CurrentIterator(last, true);
	}

	/**
	 * Добавить элемент в начало списка.
	 * @param item Добавляемый элемент.
	 */
	public void addFirst(E item) {
		MyListItem<E> oldFirst = first;
		MyListItem<E> currentItem = new MyListItem<>(item);
		if (oldFirst != null) {
			oldFirst.setPrev(currentItem);
		}
		currentItem.setNext(oldFirst);
		first = currentItem;

		//самому последнему элементу добавляем связь со следующим
		if (last == null) {
			last = first;
		}
		else if (last.getPrev() == null) {
			last.setPrev(first);
		}
	}

	/**
	 * Добавить элемент в конец списка.
	 * @param item Добавляемый элемент.
	 */
	public void addLast(E item) {
		MyListItem<E> oldLast = last;
		MyListItem<E> currentItem = new MyListItem<>(item);
		if (oldLast != null) {
			oldLast.setNext(currentItem);
		}
		currentItem.setPrev(oldLast);
		last = currentItem;

		//самому первому элементу добавляем связь со следующим
		if (first == null) {
			first = last;
		}
		else if (first.getNext() == null) {
			first.setNext(last);
		}
	}

	private class CurrentIterator implements Iterator<E> {

		/** Элемент итератора */
		private MyListItem<E> element;

		/** Является ли элемент самый первым в итераторе при инициализации*/
		private boolean isElementFirst;

		/** Является ли итератор обратным */
		private final boolean isBack;

		public CurrentIterator(MyListItem<E> element, boolean isBack) {
			this.element = element;
			this.isBack = isBack;
			isElementFirst = true;
		}

		@Override
		public boolean hasNext() {
			return element != null && ((isBack) ? element.getPrev() : element.getNext()) != null;
		}

		@Override
		public E next() {
			if (isElementFirst) {
				isElementFirst = false;
			}
			else {
				//переходим к предыдущему или следующему элементу
				element = (isBack) ? element.getPrev() : element.getNext();
			}
			return element != null ? element.getCurrent() : null;
		}
	}
}
