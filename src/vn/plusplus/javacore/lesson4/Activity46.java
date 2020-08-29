package vn.plusplus.javacore.lesson4;
import java.util.Scanner;

public class Activity46 {
    public static void main(String[] args) {
//user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a decimal number: ");
        int inputNumber = sc.nextInt();

        int number = 0;
        long binaryNumber = 0;
        int remainder, a;
        for(a = 1; number != 0; a = a * 10)
        {
            remainder = number % 2;
            number /= 2;
            binaryNumber += remainder * a;
        }

    }

}

