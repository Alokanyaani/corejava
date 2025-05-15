package if_else;

import java.util.Scanner;

public class Uppercase_lowercase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter alphabet: ");
		char ch=sc.next().charAt(0);
		
		if(ch>='A'&&ch<='Z') {
			System.out.println(ch+" is an uppercase");			
		}else if(ch>='a'&&ch<='z'){
			System.out.println(ch+" is an lowercase");
		}
		else {
			System.out.println("Invalid input. Please enter an alphabet");
		}
		sc.close();
	}

}
