package logical_operator_examples;

public class Logical_AND_Example3 {
	public static void main(String[] args) {
		
		//initializing the variables
		int a=10;
		int b=20;
		int c=20;
		int d=0;
		
		//Displaying a,b,c
		System.out.println("var1= "+a);
		System.out.println("Var2= "+b);
		System.out.println("Var3= "+c);
		
		//using logical AND to verify
		//two constraints
		if((a<b)&&(b!=c)) {
			d=a+b+c;
			System.out.println("The sum is: "+d);
		}
		else {
			System.out.println("False conditions");
		}
		
	}
}
