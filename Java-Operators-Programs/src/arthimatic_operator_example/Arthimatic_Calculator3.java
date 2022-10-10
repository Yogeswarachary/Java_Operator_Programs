package arthimatic_operator_example;

import java.util.Scanner;

public class Arthimatic_Calculator3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("");
			System.out.println("Enter the two numbers, to perform operations:- ");
			System.out.println("Enter the first number:- ");
			int number1=sc.nextInt();
			System.out.println("Enter the second number:- ");
			int number2=sc.nextInt();
			System.out.println("Choose the option, you want to perform:- ");
			System.out.println("Choose 1 for Addition:- ");
			System.out.println("Choose 2 for Subtraction:- ");
			System.out.println("Choose 3 for Multiplication:- ");
			System.out.println("Choose 4 for Division:- ");
			System.out.println("Choose 5 for Modulus:- ");
			System.out.println("Choose 6 for Exit");
			int n=sc.nextInt();
			switch(n) {
			case 1:
				//int add;
				int add=number1+number2;
				System.out.println("Result: "+add);
				break;
				
			case 2:
				//int sub;
				int sub=number1-number2;
				System.out.println("Result: "+sub);
				break;
				
			case 3:
				//int mul;
				int mul=number1*number2;
				System.out.println("Result: "+mul);
				break;
				
			case 4:
				//int div;
				int div=number1/number2;
				System.out.println("Result: "+div);
				break;
				
			case 5:
				//int mod;
				int mod=number1%number2;
				System.out.println("Result: "+mod);
				break;
				
			case 6:
				System.exit(0);
			}
		}
	}

}
