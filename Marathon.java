import java.util.Scanner;
public class Marathon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your age:");
        int age = sc.nextInt();

        System.out.println("enter your BMI:");
        double bmi = sc.nextDouble();

        if (age >= 18 && age <= 55) {
            if (bmi < 25) {
                System.out.println("u are eligible for marathan");
            } else {
                System.out.println("u are not eligible due to high bmi");
            }
        } else {
            System.out.println("u are not eligible");
        }
        sc.close();
    }
}
