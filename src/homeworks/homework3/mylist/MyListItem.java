package homeworks.homework3.mylist;

/** Ссылка на один элемент списка {@link MyList} */
class MyListItem<T> {
	/** Текущий элемент */
	private final T current;

	/** Ссылка на предыдущий элемент */
	private MyListItem<T> prev;

	/** Ссылка на следующий элемент */
	private MyListItem<T> next;

	/**
	 * Инициализация текущего элемента.
	 * @param current Текущий элемент.
	 */
	public MyListItem(T current) {
		this.current = current;
		this.prev = null;
		this.next = null;
	}

	/** Получить текущий элемент */
	public T getCurrent() {
		return current;
	}

	/** Получить ссылку на предыдущий элемент */
	public MyListItem<T> getPrev() {
		return prev;
	}

	/** Получить ссылку на следующий элемент */
	public MyListItem<T> getNext() {
		return next;
	}

	/**
	 * Обновить ссылку на предыдущий элемент.
	 * @param prev Ссылка на новый элемент.
	 */
	public void setPrev(MyListItem<T> prev) {
		this.prev = prev;
	}

	/**
	 * Обновить ссылку на следующий элемент.
	 * @param next Ссылка на новый элемент.
	 */
	public void setNext(MyListItem<T> next) {
		this.next = next;
	}
}
