import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctpass = "Alok12345";
        System.out.println("Enter Password: ");
        String pass = sc.next();

        if (pass.equals(correctpass)) {
            if (pass.length() >= 8) {
                System.out.println("correct password");
            } else {
                System.out.println("password is too sort");
            }
        } else {
            System.out.println("incorrect password");
        }
        sc.close();
    }


}
