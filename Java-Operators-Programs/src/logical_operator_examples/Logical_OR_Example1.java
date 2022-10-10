package logical_operator_examples;

public class Logical_OR_Example1 {
	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=20;
		System.out.println(a>b||a<c);//true||true=true
		System.out.println(a>b|a>c);//true|true=true
		// || VS |
		System.out.println(a>b||a++<c);//true||true=true
		System.out.println(a);//10
		System.out.println(a>b|a++<c);//true|true=true
		System.out.println(a);//11
	}
}
