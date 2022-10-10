package bitwise_operator_examples;

public class Bitwise_Operator_Example1 {
	public static void main(String[] args) {
		
		//Initial values
		int a=5,b=7;
		
		//bitwise AND
		//0101 & 0111=0101=5
		System.out.println("a&b= "+(a&b));
		
		//bitwise OR
		//0101 | 0111=0111=7
		System.out.println("a|b= "+(a|b));
		
		//bitwise XOR
		//0101 ^ 0111=0010=2
		System.out.println("a^b= "+(a^b));
		
		//bitwise NOT
		//~00000000 00000000 00000000 00000101=11111111 11111111 11111111 11111010
		// will give 1's complement (32 bit) of 5 = -6
		System.out.println("~a= "+ ~a);
		
		//We can also be combined with assignment operator to provide shorthand assignment
		//a=a&b
		a&=b;
		System.out.println("a= "+a);
	}
}
