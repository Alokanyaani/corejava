package if_else;

import java.util.Scanner;

public class Multiply1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number: ");
		int num=sc.nextInt();
		
		if(num<100) {
			if(num%10==0) {
				System.out.println(num+"  is under 100 & divided by 10");
			}else{
				System.out.println(num+" the is not divided by 10");
			}
		}else {
			System.out.println(num+"  is out of 100");
		}
		sc.close();
	}

}
