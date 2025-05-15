package if_else;

import java.util.Scanner;

public class Positive_divide {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enetr number: ");
		int num=sc.nextInt();
		
		if(num>0) {
			if(num%3==0) {
				System.out.println(num+" positive and divided by 3");
			}else {
				System.out.println(num+" positive number but not divided by 3");
			}
			
		}else {
			System.out.println(num+" negative  number");
		}
		sc.close();
	}
}
