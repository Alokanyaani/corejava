package operator;

import java.util.Scanner;

public class Multiply {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter number: ");
		int number = sc.nextInt();
		

		// * << + / -
		//int result=number*2;
		//int result=number<<2;
		//int result=number+number;
		System.out.println("enter your multiplier");
		double multiplier=sc.nextDouble();
		double factor=1/multiplier;
		int result=(int) (number/factor);
		
		//int result = -number-number-number-number-number-number-number-number;
		System.out.println(result);
		sc.close();
	}

}