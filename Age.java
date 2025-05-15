package if_else;

import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		if(age<0) System.out.println("envalid marks entered");
		else if(age<13)System.out.println("You are a Child");
		else if(age<=19) System.out.println("You are a Teenager");
		else if(age<=59)System.out.println("You are an Adult");
	    else System.out.println("You are a Senior");
		
		sc.close();
	}

}
