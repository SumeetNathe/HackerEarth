package com.datastructures.stack;

public class Dog extends Animal {


	public Dog() {
		//super();
		
		System.out.println("Dog class constructor");
	}
	
	public Dog(String name) {
		
		this.name=name;
	}
	
	@Override
	public void show() {
		System.out.println("Dog class show method");
		System.out.println(name);
	}
	/*void method() {
		int a;
		System.out.println(a);
	}*/
	
	public static void main(String[] args) {
		
		Animal a=new Dog("xygf");
		
		
		a.show();
		
		
	}
}
