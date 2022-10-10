package logical_operator_examples;

public class Logical_AND_Example4 {
	public static void main(String[] args) {
		
		//initializing the variables
		int a=10, b=20, c=15;
		
		//displaying b
		System.out.println("Value of b: "+b);
		
		//Using Logical AND
		//Short circuiting means first condition is false so the second condition is never reached
		//So ++b(pre-increment) doesn't take place and value of b remains unchanged
		if((a>c)&&(++b>c)) {
			System.out.println("Inside the if condition");
		}
		else {
			System.out.println("Condition false");
		}
	}
}
