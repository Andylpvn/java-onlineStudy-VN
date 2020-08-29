package vn.plusplus.javacore.lesson4;

public class Activity43 {
    public static void main(String[] args) {
        System.out.println("So chia het cho 3 la: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ", ");
        }
        System.out.println("\n\nSo chia het cho 5 la: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.print(i + ", ");
        }
        System.out.println("\n\nSo chia het cho ca 3 va 5 la: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0 && i % 3 == 0)
                System.out.print(i + ", ");
        }
    }
}
