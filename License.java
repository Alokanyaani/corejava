package if_else;
import java.util.Scanner;
public class License {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your age: ");
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.println(" Did u pass driving test?");
			boolean driveTest=sc.nextBoolean();
			if(driveTest) {
				System.out.println("u are eligible for driving license");
			}else {
				System.out.println("sorry you has not passed drive test");
			}
		}else {
			System.out.println("u are not 18 year old");
		}
		sc.close();
	}

}
