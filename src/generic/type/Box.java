package generic.type;

public class Box<T> {
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}

/*
public class Box {
	private Object object;

	public void setObject(Object object) {
		this.object = object;
	}

	public Object get() {
		return object;
	}
}*/
