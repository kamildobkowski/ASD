package Struktury;

import java.util.*;

public class FILO<E> implements Iterable<E>, Queue<E> {
	List<E> list;

	public FILO() {
		list = new LinkedList<>();
	}

	@Override
	public void Push(E obj) {
		list.add(obj);
	}

	public E Pop() {
		return list.removeLast();
	}


	@Override
	public Iterator<E> iterator() {
		return list.iterator();
	}

	@Override
	public Spliterator<E> spliterator() {
		return list.spliterator();
	}
}
