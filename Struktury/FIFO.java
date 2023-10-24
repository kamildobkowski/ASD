package Struktury;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FIFO<E> implements Iterable<E>, Queue<E> {
	List<E> list;

	public FIFO() {
		list = new LinkedList<>();
	}

	@Override
	public Iterator<E> iterator() {
		return list.iterator();
	}

	@Override
	public E Pop() {
		return list.removeFirst();
	}

	@Override
	public void Push(E obj) {
		list.add(obj);
	}

}
