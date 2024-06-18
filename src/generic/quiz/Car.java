package generic.quiz;

public class Car<T> {
	private T t;

	public void set(T t) {
		this.t = t;

	}

	public T get() {
		return t;

	}

	public boolean inIns() {
		return t instanceof String;
	}
}