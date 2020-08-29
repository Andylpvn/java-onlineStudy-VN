package vn.plusplus.javacore.lesson4;

import java.util.Scanner;

public class Activity41 {
    public static void main(String[] args) {

        System.out.println("Dien vao do dai cua day so Fibonaci");
        Scanner scanner = new Scanner(System.in);
        int dodai = scanner.nextInt();
        System.out.println("Day so Fibonaci co do dai " + dodai + " la: ");

        int f1 = 0, f2 = 1, i;

        if (dodai < 1)
            return;

        for (i = 1; i <= dodai; i++) {
            System.out.print(f2+" ");

            int sotieptheo = f1 + f2;
            f1 = f2;
            f2 = sotieptheo;

        }
    }
}
