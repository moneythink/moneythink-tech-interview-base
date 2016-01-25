package myset;

public class Set<V> {
	
	private final static int defaultCapacity = 16;
	private int currentSize;
	
	private Item<String,V>[] table;
	
	public Set() {
		this(defaultCapacity);
	}
	
	public Set(int size) {
		this.table = new Item[size];
		this.currentSize = 0;
	}
	
	public Object get(String key) {
		Object value = null;
		
		for (Item val : this.table) {
			if (val.getKey().equals(key)) {
				value = val.getValue();
				break;
			}
		}
		
		return value;
	}
	
	public void put(String key, Object value) {
		int index = this.indexOf(key);
		
		Item newItem = new Item(key, value);
		
		if (index < 0) {
			this.table[this.currentSize++] = newItem;
		} else {
			this.table[index] = newItem;
		}
	}
	
	public int size() {
		return this.currentSize;
	}
	
	
	private int indexOf(String key) {
		int index = -1;
		
		for (int i = 0; i < this.currentSize; i++) {
			if (this.table[i].getKey().equalsIgnoreCase(key)) {
				index = i;
				break;
			}
		}
		
		return index;
	}
	
}
