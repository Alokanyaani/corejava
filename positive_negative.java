package if_else;
import java.util.Scanner;

public class positive_negative {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter a number: ");
		int num=sc.nextInt();
		sc.close();
		
		if(num<0)System.out.println("your number is negative");
		else if(num==0)System.out.println("your number is zero");
		else System.out.println("your number is positive");
		
	}

}
