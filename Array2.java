import java.util.Scanner;

import java.io.*;

public class Array2 {

	public static void main(String[] args) throws IOException {
		int size, quer;
		BufferedReader br = new BufferedReader(new
		        InputStreamReader(System.in));
		size = br.read();
		quer = br.read();
		
		

		int[] arrsum = new int[size+1];
		
		
		for (int i = 1; i <= size; i++) {
			arrsum[i] = arrsum[i - 1] + br.read();;
		}

		for (int i = 1; i <=quer; i++) {
			int f = br.read();
			int l = br.read();

			System.out.println((arrsum[l] - arrsum[f-1]) / (l + 1 - f));
		}
	}
}
