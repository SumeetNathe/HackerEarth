package com.datastructures.stack;

public class Animal {
	
	public String name;
	
	public Animal() {
		System.out.println("Default constructor of Animal class");
	}
	
	public Animal(String name) {
		this.name=name;
		System.out.println(name);
	}
	
	public void show() {
		System.out.println("Animal class show method");
		System.out.println(name);
	}

}
