package com.datastructures.stack;

import java.util.Stack;

public class StackConcept {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack();
		
		s.push(1);
		s.push(2);
		s.push(3);
		
		function(s);
		
		
	}
	
	public static void function(Stack<Integer> s) {
		if(s.isEmpty())
			return;
		int temp = s.pop();
		function(s);
		System.out.println(temp);
	}

}
