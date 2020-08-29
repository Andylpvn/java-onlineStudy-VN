package vn.plusplus.javacore.lesson5;

public class Activity51 {
    public static void main(String[] args) {

        int total = 0;
        int number;
        int orig;
        int remainder;

        System.out.print("Armstrong numbers from 1 to 500 is: ");

        for (orig = 1; orig <= 500; orig++) {
            number = orig;
            while (number > 0) {
                remainder = number % 10;
                total = total + (remainder * remainder * remainder);
                number = number / 10;
            }
            if (total == orig) {
                System.out.print(orig + " ");

            }
                total = 0;
        }
    }
}
