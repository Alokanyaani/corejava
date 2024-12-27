package Question;

import java.util.Scanner;

public class table20to8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i =20; i>=8;i--){
            System.out.println("Table of " + i + ":");
            for(int a =1; a<=10;a++){
                System.out.println(i + " * " + a + " = " + i * a);
            }
            
        }
    }
}
