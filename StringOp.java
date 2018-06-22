/*Java program to convert string into Lowercase and Uppercase*/
import java.util.*; 
class StringOp
{
   public static void main(String args[])
   {
		Scanner sc= new Scanner(System.in);
		String str="";
		
		//input string
		System.out.print("Enter any string: ");
		str=sc.nextLine();

		//declaring objects to store lowercase and uppercase strings
		String lowerCaseString="",upperCaseString="";

		//convert into lower case
		lowerCaseString= str.toLowerCase();  
		//convert into upper case
		upperCaseString= str.toUpperCase();  

		//printing the strings
		System.out.println("Original String: "+str);
		System.out.println("Lower Case String: "+lowerCaseString);
		System.out.println("Upper Case String: "+upperCaseString);   
   }
}