package if_else;

import java.util.Scanner;

public class Passport {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("r u indian citizen");
		boolean indianCitizen = sc.nextBoolean();
		if (indianCitizen) {
			System.out.println("enter your age:");
			int age = sc.nextInt();
			if (age >= 18) {
				System.out.println("fee paid");
				boolean feepaid = sc.nextBoolean();
				if (feepaid) {
					System.out.println("congrats u r eligible");
				} else {
					System.out.println("do u have fee exemption from govt");
					boolean feeExption = sc.nextBoolean();
					if (feeExption) {
						System.out.println("congrats u r eligible");
					} else {
						System.out.println("sorry not eligible bcoz of fee");
					}
				}
			} else {
				System.out.println("do u have age exemption from govt");
				boolean ageExemption = sc.nextBoolean();
				if (ageExemption) {
					System.out.println("fee paid ?");
					boolean feepaid = sc.nextBoolean();
					if (feepaid) {
						System.out.println("congrats u r eligible");
					} else {
						System.out.println("do u have fee exemption from govt");
						boolean feeExption = sc.nextBoolean();
						if (feeExption) {
							System.out.println("congrats u r eligible");
						} else {
							System.out.println("sorry not eligible bcoz of fee");
						}
					}
				} else {
					System.out.println("sorry not elogible bcoz of age");
				}
			}

		} else {
			System.out.println("sorry not eligible");
		}
		sc.close();
	}

}
