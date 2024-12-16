package com.dec.day14.collection.list;

public class GenericList<T> {
	Object [] objects;
	int size;
	
	public GenericList() {
		objects = new Object[3];
		size = 0;
	}
	
	public void add(T object) { // 제네릭으로 받을 수 있음
		objects[size] = object;
		size++;
	}
	
	public T get(int index) { // 제네릭으로 반환
		return (T)objects[index];
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		objects = new Object[3];
		size = 0;
	}
	
}
