package operator;

public class Unary {
	public static void main(String[] args) {
		int num1=100;
		int result=~num1;
		System.out.println("result: "+result);
		int X=num1>>1;
		System.out.println("X: "+X);
		int R=num1<<1;
		System.out.println("R: " +R);
	}

}
