package edu.pitt.cs;

import static org.mockito.Mockito.when;

public class CatImpl implements Cat {

	Cat c;
	int id; 
	String name;
	boolean rented;

	public CatImpl(int id, String name) {
		c = Cat.createInstance(InstanceType.MOCK, id, name);
		when(c.getId()).thenReturn(id);
		when(c.getName()).thenReturn(name);
		when(c.getRented()).thenReturn(rented);
		this.id = id;
		this.name = name;
		rented = false;
	}

	public void rentCat() {
		rented = true;
	}

	public void returnCat() {
		rented = false;
	}

	public void renameCat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public boolean getRented() {
		return rented;
	}

	public String toString() {
		return "ID " + id + ". " + name;
	}

}