package logical_operator_examples;

public class Logical_AND_Example2 {
	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=20;
		System.out.println(a<b&&a++<c);//false&&true=false
		System.out.println(a);//10
		System.out.println(a<b&a++<c);//false&&true=false
		System.out.println(a);//11
	}
}
