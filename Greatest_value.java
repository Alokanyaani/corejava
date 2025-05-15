package if_else;

import java.util.Scanner;

public class Greatest_value {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter 1st num: ");
		int num1=sc.nextInt();
		
		System.out.println("enter 2nd num: ");
		int num2=sc.nextInt();

		System.out.println("enter 3rd num: ");
		int num3=sc.nextInt();
		

		System.out.println("enter 4th num: ");
		int num4=sc.nextInt();
		

		System.out.println("enter 5th num: ");
		int num5=sc.nextInt();
		sc.close();
		int max=Integer.MIN_VALUE;
		
		if(num1>max)max=num1; //System.out.println(min+" is lowest number");
		if(num2>max)max=num2; //System.out.println(min+" is lowest number");
		if(num3>max)max=num3; //System.out.println(min+" is lowest number");
		if(num4>max)max=num4; //System.out.println(min+" is lowest number");
		if(num5>max)max=num5; System.out.println(max+" is greatest value ");
		
		
		
	}

}
