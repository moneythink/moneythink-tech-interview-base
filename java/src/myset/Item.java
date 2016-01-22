package myset;

public class Item<K,V> {
	private K key;
	private V value;
	
	public Item(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public V getValue() {
		return value;
	}
	
	public K getKey() {
		return key;
	}
	
	public int hashCode() {
		return (this.getKey()==null ? 0 : this.getKey().hashCode()) ^
	     (this.getValue()==null ? 0 : this.getValue().hashCode());
	}
}
