
package com.datastructures;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class ComapreTheOccurancesInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[][] = new int[2][1000001];
		int max= Integer.MIN_VALUE;
		int maxCount= Integer.MIN_VALUE;
		for(int i = 1;i<arr.length;i++) {
			int temp = sc.nextInt();
			if(temp>=0)
			{
				arr[0][temp] +=1;
				if(arr[0][temp]> maxCount) {
					maxCount = arr[0][temp];
					max = temp;
				}
			}
			else {
				arr[1][Math.abs(temp)] += 1;
				if(arr[1][Math.abs(temp)]>maxCount) {
					maxCount = arr[1][Math.abs(temp)];
					max = temp;
				}
			}
		}
		
		System.out.println(max);
	}

}
