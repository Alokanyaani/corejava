package if_else;
import java.util.Scanner;
public class Divide {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		
		if(num%5==0&&num%11==0) {
			System.out.println(num+" is divide");
		}else {
			System.out.println(num+" not divide");
		}
		sc.close();
	}

}
