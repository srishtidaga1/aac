package Calcu;
import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter First Number");
		    System.out.println("Enter Second Number");
		    
			double a = sc.nextDouble();
		    double b = sc.nextDouble();
			
			System.out.println("Enter the Operation which you want to Perform");
			System.out.println("Symbol for Addition + ");
			System.out.println("Symbol for Subtraction - ");
			System.out.println("Symbol for Multiplication * ");
			System.out.println("Symbol for Division / ");
			System.out.println("------------------------ ");
			
			char ch = sc.next().charAt(0);
			
			if(ch=='+') {
				System.out.println("Addition of "+a+" and "+b+" = "+(a+b));
			}
			else if(ch=='-') {
				System.out.println("Subtraction of "+a+" and "+b+" = "+(a-b));
			}else if(ch=='*') {
				System.out.println("Multiplication of "+a+" and "+b+" = "+(a*b));
			}else if(ch=='/') {
				System.out.println("Division of "+a+" and "+b+" = "+(a/b));
			}
			else {
				System.out.println("Inputs are not valid");
			}
			
			
			

			}

		}


	