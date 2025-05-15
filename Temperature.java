package if_else;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter temperature: ");
		int temp=sc.nextInt();
		
		if(temp>=15) {
			if(temp>35) {
				System.out.println("the temperature is hot");
			}else {
				System.out.println("the temp is moderate");
			}
		}else {
			System.out.println("the temperature is cold");
		}
		sc.close();
	}

}
