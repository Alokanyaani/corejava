package if_else;
import java.util.Scanner;
public class Vowal_consonant {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter character: ");
		char ch=sc.next().charAt(0);
		
		if(ch>='a'&&ch<='z') {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println(ch+" is vowal");
			}else {
				System.out.println(ch+" is consonant");
			}
		}else {
			System.out.println("Invalid input. Please enter an alphabet");
		}
		sc.close();
	}

}
