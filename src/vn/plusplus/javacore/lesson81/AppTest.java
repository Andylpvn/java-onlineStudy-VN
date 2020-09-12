package vn.plusplus.javacore.lesson81;

import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {

        System.out.print("Total Employees: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        EmployeeManagement nv = new EmployeeManagement(n);
        nv.inputInformation();
        for (Employee a : nv.Employees) {
            System.out.println(a.toString());
            System.out.println();

        }
        System.out.println("Nhan vien co luong cao nhat la: ");
        nv.maxSalary();

        System.out.println();

        System.out.println("Nhan vien co luong thap nhat la: ");
        nv.minSalary();

    }
}
