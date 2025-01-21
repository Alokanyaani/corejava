/*Write a Java program to check if a number is a palindrome in Java? ( 121 is a
palindrome, 321 is not)
A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
palindrome because the reverse of 321 is 123, which is not equal to 321.
*/

package Practice;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n,c ,r,s=0;
        System.out.println("Enter your num: ");
        n=sc.nextInt();
        c=n;

        while(n>0){

            r=n%10;
            s=(s*10)+r;
            n=n/10;

        }
        if(c==s) {
            System.out.println("palindrom num");

        }else{
            System.out.println("not palindrom num");
        }
    }

}
