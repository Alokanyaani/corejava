package loop;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		
		int f=1;
		
		int i=1;
		while(i<=num) {
		f=f*i;
		i++;
		}
		System.out.println(f);
		sc.close();
	}

}
