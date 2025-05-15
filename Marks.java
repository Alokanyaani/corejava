package if_else;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your marks: ");
		int marks=sc.nextInt();
		if(marks<=0||marks>=100)System.out.println("envalid marks entered");
		else if(marks>=90) System.out.println("A");			
		else if(marks>=80) System.out.println("B");
		else if(marks>=70) System.out.println("C");
		else if(marks>=60)System.out.println("D");
		else System.out.println("F");
		
		sc.close();
}

}
