import java.io.*;
import java.util.Scanner;

class Factorial{
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
        int num,fact = 1;
        num = sc.nextInt();
        
        while(num>1){
            fact = fact * num;
            num--;
        }
        System.out.println(fact);
    }
}