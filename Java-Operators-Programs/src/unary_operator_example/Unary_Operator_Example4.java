package unary_operator_example;

public class Unary_Operator_Example4 {

	public static void main(String[] args) {
		int x=50;
		int y=100;
		int z=200;
		
		int a,b,c;
		a=++x;
		b=y++;
		c=x+y++ + ++z;//x+y(increment)+ preIncrement of z
		
		 System.out.println("x = " +x); 
		 System.out.println("y = " +y); 
		 System.out.println("z = " +z); 

		 System.out.println("a = " +a); 
		 System.out.println("b = " +b); 
		 System.out.println("c = " +c); 
	}

}
