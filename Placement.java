package if_else;

import java.util.Scanner;

public class Placement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("have u cleared campus test/online test?");
		boolean campusTest=sc.nextBoolean();
		
		if(campusTest) {
			System.out.println("have u received offer letter?");
			boolean offerLetter=sc.nextBoolean();
			
			if(offerLetter) {
				System.out.println("have u received joining letter?");
				boolean joiningLetter=sc.nextBoolean();
				
				if(joiningLetter) {
					System.out.println("do u have medical fitness certificate");
					boolean fitnessCertificate=sc.nextBoolean();
					
					if(fitnessCertificate) {
						System.out.println("Congrats !!! welcome to Corporate World");
			
					}else {
						System.out.println("sorry u do not have medical fitness certificate");
					}
				}else {
					System.out.println("sorry u do not have joining letter");
				}
			}else {
				System.out.println("sorry u do not have offer letter");
			}
		}else {
			System.out.println("sorry pls. clear exam first");
		}
		sc.close();
	}

}
