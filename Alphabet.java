package if_else;

import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an alphabet: ");
		char ch=sc.next().charAt(0);
		
		if(ch>='A'&&ch<='Z') {
			System.out.println(ch+" upper case");
				
		}else {
			if(ch>='a'&&ch<='z') {
				System.out.println(ch+" lower case ");
		}else {
			System.out.println(ch+" nither");
		}
		}
		sc.close();
	}

}
