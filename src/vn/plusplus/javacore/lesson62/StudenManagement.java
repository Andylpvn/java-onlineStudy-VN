package vn.plusplus.javacore.lesson62;

import java.util.Scanner;

public class StudenManagement {
    private int n;
    private Student[] students;

    public StudenManagement(int n) {
        students = new Student[n];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao sinh vien thu " + (i + 1));
            String name = scanner.nextLine();
            System.out.println("Nhap vao GPA cua sinh vien thu " + (i + 1));
            float gpa = scanner.nextFloat();
            scanner.nextLine();
            students[i] = new Student(name, gpa);

        }
    }
    public int tinhDo() {
        int tinh =0;
        for (Student st : students) {
            if (st.check() == true) {
                tinh = tinh +1;
            }
        }
        return tinh;
    }
    public int tinhRot() {
        int tinh =0;
        for (Student st : students) {
            if (st.check() == false) {
                tinh = tinh +1;
            }
        }
        return tinh;
    }
}
