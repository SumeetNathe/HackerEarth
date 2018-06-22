import java.util.Scanner;
import java.lang.StringBuilder;
 
class CaseInvert {
    public static void main(String args[] ) throws Exception {
        Scanner sc= new Scanner(System.in);
	        String s,s1,sx;
	        char[] temp=new char[100];
	        s=sc.nextLine();
	        int x=s.length();
	        for(int i=0;i<x;i++){
	            char c = s.charAt(i);
	            s1=Character.toString(c);
	        	if(Character.isLowerCase(c)){
	        		sx=s1.toUpperCase();
	        		temp[i]=sx.charAt(0);
	        	 }
	        	else if(Character.isUpperCase(c)){
	        		
	        		 sx=s1.toLowerCase();
	        		temp[i]=sx.charAt(0);
	        	}
	        	else{
	        		temp[i]=c;
	        	}
	        }
	        String s2= new String(temp);
	        s2=s2.substring(0,x);
	        System.out.println(s2);
    }
}