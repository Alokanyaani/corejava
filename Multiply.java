package if_else;

import java.util.Scanner;

public class Multiply {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number: ");
		int num=sc.nextInt();
		
		if(num%3==0) {
			System.out.println(num+" is multiply of 3");
		}else {
			System.out.println(num+" is not multiply of 3");
		}
		sc.close();
	}

}
