package myset;

public class Set<V> {

	private final static int defaultCapacity = 16;

	private Item<String,V>[] table;

	private int size = 0;

	public Set() {
		this(defaultCapacity);
	}

	public Set(int size) {
		table = new Item[size];
	}

	public Object get(String key) {
		for (int i = 0; i < size; i++){
			if(table[i].getKey().equals(key)){
				return table[i].getValue();
			}
		}

		return null;
	}

	private int indexOf(String key) {
		int index = -1;

		for (int i = 0; i < size; i++){
			if(table[i].getKey().equals(key)){
				index = i;
				break;
			}
		}

		return index;
	}

	public void put(String key, Object value) {
		int index = this.indexOf(key);


		if (index == - 1){
			table[size] = new Item(key, value);
			size++;
		}
		else{
			table[index] = new Item(key, value);
		}
	}

	public int getSize () {
		return size;
	}
}
