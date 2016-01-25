package myset;

public class Set<V> {

	private final static int defaultCapacity = 16;

	private Item<String,V>[] table;

	public Set() {
		this(defaultCapacity);
	}

	public Set(int size) {
	}

	public Object get(String key) {
		return null;
	}

	public void put(String key, Object value) {
	}
}
