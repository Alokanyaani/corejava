
import java.util.Scanner;

public class parameters {
    public static void sumnum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum is: "+sum);
    }

    public static void main(String[] args) {
        sumnum();
    }
}
