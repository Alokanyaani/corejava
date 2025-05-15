package if_else;

import java.util.Scanner;

public class Divide1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter number: ");
		int num=sc.nextInt();
		
		if(num%2==0) {			
			if(num%3==0) {				
				if(num%5==0) {
					System.out.println(num+" divided by 2,3 and 5");
				}else {
					System.out.println(num+" divided by 2 and 3 but not divided by 5");
				}
			}else {
				System.out.println(num+" divided by 2 and 5 but not divided by 3");
			}
		}
		else {
			System.out.println(num+" divided by 5 and 3 but not divided by 2");
		}
		sc.close();
	}

}
