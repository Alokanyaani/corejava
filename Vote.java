package if_else;
import java.util.Scanner;
public class Vote {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your age: ");
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("eligible for vote");
		}else {
			System.out.println("not eligible for vote");
		}
		sc.close();
	}

}
