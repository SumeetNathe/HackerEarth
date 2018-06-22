package com.datastructures.stack;

import java.util.Scanner;
import java.util.Stack;

public class BasicEntranceTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tcase,limit;
		tcase = sc.nextInt();
		limit = sc.nextInt();
		int top = -1;
		//int stack [] = new int[limit];
		Stack<Integer> s =new Stack();
		while(tcase-->0) {
			int q = sc.nextInt();
			if(q==1) {
				if(s.isEmpty())
					System.out.println("No Food");
				else {
					System.out.println(s.pop());
				}
			}
			else {
				int num = sc.nextInt();
				s.push(num);
			}
		}
	}

}
