package com.datastructures;

import java.io.IOException;
import java.util.Scanner;

public class OddEvenByArray {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		int size, quer;

		size = sc.nextInt();
		quer = sc.nextInt();
		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		while (quer-- > 0) {
			int fnum = sc.nextInt();
			if (fnum == 0) {
				int L = sc.nextInt();
				int R = sc.nextInt();

				if (arr[R - 1] == 0)
					System.out.println("EVEN");

				else if(arr[R-1]==1)
					System.out.println("ODD");

			} else {
				int R = sc.nextInt();
				if (arr[R - 1] == 0) 
					arr[R - 1] = 1;
				else
					arr[R - 1] = 0;
			}

		}
	}

}
