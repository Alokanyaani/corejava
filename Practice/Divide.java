package operator;

import java.util.Scanner;

public class Divide {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	
		
		System.out.println("enter number: ");
		int number=sc.nextInt();
		
		int result=number>>4;
		System.out.println(result);
		sc.close();
	}

}
