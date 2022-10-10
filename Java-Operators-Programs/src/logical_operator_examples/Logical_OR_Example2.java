package logical_operator_examples;

public class Logical_OR_Example2 {
	public static void main(String[] args) {
		
		//Initializing variables
		int a=10, b=1, c=10, d=30;
		
		//displaying a,b,c
		System.out.println("Var1= "+a);
		System.out.println("Var2= "+b);
		System.out.println("Var3= "+c);
		System.out.println("Var4= "+d);
		
		//Using logical OR to verify
		//two constraints
		if(a>b || c==d) {
			System.out.println("One or both conditions are true");
		}
		else {
			System.out.println("Both the conditions are false");
		}
	}
}
