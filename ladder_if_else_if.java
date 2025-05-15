package if_else;

import java.util.Scanner;

public class ladder_if_else_if {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter day: ");
		int day=sc.nextInt();
		sc.close();
		
		
		if(day==1) System.out.println("Litti choka");
		else if(day==2) System.out.println("mix veg");
		else if(day==3) System.out.println("Bhindi masala");
		else if(day==4) System.out.println("kadhai paneer");
		else if(day==5) System.out.println("bagan bharta");
		else if(day==6) System.out.println("kaju curry");
		else if(day==7) System.out.println("hotel band");
	}

}
