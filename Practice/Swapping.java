package operator;

public class Swapping {
	public static void main(String[] args) {
		int num1=100;
		int num2=200;
		
		num1=num1^num2;
		num2=num1^num2;
		num1=num1^num2;
		System.out.println("num1:- "+num1 +"\n"+"num2:- "+ num2);
	}

}
