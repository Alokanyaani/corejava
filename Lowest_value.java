package if_else;

import java.util.Scanner;

public class Lowest_value{
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
		int min=Integer.MAX_VALUE;
		if(num1<min)min=num1; //System.out.println(min+" is lowest number");
		if(num2<min)min=num2; //System.out.println(min+" is lowest number");
		if(num3<min)min=num3; //System.out.println(min+" is lowest number");
		if(num4<min)min=num4; //System.out.println(min+" is lowest number");
		if(num5<min)min=num5; System.out.println(min+" is lowest number");
		
		
	}

}
