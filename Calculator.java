package Switch_case;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		System.out.println("enter your choice\n+ for addition\n- for subtraction\n* for multiply\n/ for divide\n% modulus");
		char choice=sc.next().charAt(0); int a, b , result;
		switch(choice) {
		case '+':
			System.out.println("enter number 1 for addition");
			a=sc.nextInt();
			System.out.println("enter number 2 for addition");
			b=sc.nextInt();
			result=a+b;
			System.out.printf("The sum of %d and %d  =  %d",a,b,result);
			break;
		case '-':
			System.out.println("enter number 1 for subtraction");
			a=sc.nextInt();
			System.out.println("enter number 2 for subtraction");
			b=sc.nextInt();
			result=a-b;
			System.out.printf("The sub of %d and %d  =  %d",a,b,result);
			break;
		case '*':
			System.out.println("enter number 1 for multiply");
			a=sc.nextInt();
			System.out.println("enter number 2 for multiply");
			b=sc.nextInt();
			result=a*b;
			System.out.printf("The multiply of %d and %d  =  %d",a,b,result);
			break;
		case '/':
			System.out.println("enter number 1 for divide");
			a=sc.nextInt();
			System.out.println("enter number 2 for divide");
			b=sc.nextInt();
			result=a/b;
			System.out.printf("The divide of %d and %d  =  %d",a,b,result);
			break;
		case '%':
			System.out.println("enter number 1 for modulus");
			a=sc.nextInt();
			System.out.println("enter number 2 for modulus");
			b=sc.nextInt();
			result=a%b;
			System.out.printf("The modulus of %d and %d  =  %d",a,b,result);
			break;	
		default:
			System.out.println("There is no such option available");
			break;
		
		}
	  
		sc.close();
	}

}
