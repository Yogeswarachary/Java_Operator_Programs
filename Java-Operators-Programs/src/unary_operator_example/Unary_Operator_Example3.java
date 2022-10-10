package unary_operator_example;

public class Unary_Operator_Example3 {
	public static void main(String[] args) {
		int a=20;
		System.out.println("Number="+a);
		
		//Performing Unary operation
		int b=a++;//20+0
		int c=-a;//-(20+1)
		int d=++a;//1+21
		int e=a--;//22-0
		int f=--a;//21-1
		System.out.println("The 'b' value is:- "+b);
		System.out.println("The 'c' value is:- "+c);
		System.out.println("The 'd' value is:- "+d);
		System.out.println("The 'e' value is:- "+e);
		System.out.println("The 'f' value is:- "+f);
	}
}
