package operator;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc= new Scanner(System.in);
		int num1= sc.nextInt();sc.close();
		int result= num1++;
		System.out.println(result);
		
		//post increment  mean use value first then perform operation
		//pre operate first then use the value 

		
	}

}
