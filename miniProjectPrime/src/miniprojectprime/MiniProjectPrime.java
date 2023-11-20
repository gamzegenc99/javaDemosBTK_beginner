package miniprojectprime;

import java.util.Scanner;

public class MiniProjectPrime {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("-- Please enter the number-- ");
        int input = scanner.nextInt();

        boolean isPrime = true; //control point
        if (input < 1) {
            System.out.println(" invalid number");
            return;
        }
        if (input == 1) {
            System.out.println("its not prime number");
            return;
        }
        //prime number just divided by 1 and itself so we not included the 1 or itself in loop .
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Number:" + input + " is prime");
        } else {
            System.out.println("Number:" + input + " is not prime");
        }

    }

}
