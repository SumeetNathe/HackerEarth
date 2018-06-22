package com.datastructures.stack;

public class Sample {

	int top;
	int MAX = 100;
	int stack[] = new int[MAX];

	boolean isEmpty() {
		return (top < 0);
	}

	Sample() {
		top = -1;
	}

	boolean push(int x) {
		if (top > MAX) {
			System.out.println("Stack Overflow!");
			return false;
		} else {
			stack[++top] = x;
			return true;
		}
	}

	int printTop() {
		return stack[top];
	}

	int pop() {
		if (top < 0) {
			System.out.println("Stack is empty!");
			return 0;
		} else {
			int x = stack[top--];
			return x;
		}
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.printTop());

	}

}
