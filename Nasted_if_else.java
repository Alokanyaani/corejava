package if_else;

import java.util.Scanner;

public class Nasted_if_else {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("how to booked online  ticket: ");
		boolean ticketStatus=sc.nextBoolean();
		
		if(ticketStatus) {
			System.out.println("Do you have online copy");
			boolean onlineCopy=sc.nextBoolean();
			if(onlineCopy) {
				System.out.println("do u have id proof");
				boolean idStatus=sc.nextBoolean();
				if(idStatus) {
					System.out.println("u are okay to travel");
					
				}else {
					System.out.println("sorry no id proof");
				}
				
			}else {
				System.out.println("Sorry online copy not avl");
			}
		}else {
			System.out.println("sorry not ticket");
		}
		
		
		
		sc.close();
	}
	
}
