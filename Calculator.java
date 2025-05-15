package if_else;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" enter your choice\n+ for addition\n- for subtraction\n* for multiply\n/ for divide\n% modulus");
		char ch=sc.next().charAt(0);
		int num1,num2,result;
		
		
		if(ch=='+') {
			System.out.println("Enter 1st num: ");
			num1=sc.nextInt();
			
			System.out.println("Enter 1st num: ");
			num2=sc.nextInt();
			result =num1+num2;
			System.out.printf("The sum of %d and %d  =  %d",num1,num2,result);
		}else if(ch=='-') {
			System.out.println("Enter 1st num: ");
			num1=sc.nextInt();
			
			System.out.println("Enter 1st num: ");
			num2=sc.nextInt();
			result =num1-num2;
			System.out.printf("The subtraction of %d and %d  =  %d",num1,num2,result);
		}else if(ch=='*') {
			System.out.println("Enter 1st num: ");
			num1=sc.nextInt();
			
			System.out.println("Enter 1st num: ");
			num2=sc.nextInt();
			result =num1*num2;
			System.out.printf("The multiply of %d and %d  =  %d",num1,num2,result);
		}else if(ch=='/') {
			System.out.println("Enter 1st num: ");
			num1=sc.nextInt();
			
			System.out.println("Enter 1st num: ");
			num2=sc.nextInt();
			result =num1/num2;
			System.out.printf("The divide of %d and %d  =  %d",num1,num2,result);
		}else if(ch=='%') {
			System.out.println("Enter 1st num: ");
			num1=sc.nextInt();
			
			System.out.println("Enter 1st num: ");
			num2=sc.nextInt();
			result =num1%num2;
			System.out.printf("The modulus of %d and %d  =  %d",num1,num2,result);
		}
		sc.close();
	}

}
