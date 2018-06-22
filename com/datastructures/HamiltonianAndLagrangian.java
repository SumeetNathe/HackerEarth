package com.datastructures;

import java.util.Scanner;

public class HamiltonianAndLagrangian {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long size = sc.nextLong();
		long arr [] = new long [(int) size];
		 for(int i = 0 ;i<size;i++) {
			 arr[i] = sc.nextInt();
		 }
		 
		 for(int i = 0 ;i<size;) {
			 
			 if(i+1==size)
				 System.out.print(arr[i]);
			 
			 else if(arr[i]<arr[i+1]) {
				 long temp=arr[i+1];
				 if(temp>arr[i+2]){
					System.out.print(temp);
				 }
				 else
					 System.out.print(arr[i+2]);
				 
				 }
			 i++;
			 
		 }

	}

}
