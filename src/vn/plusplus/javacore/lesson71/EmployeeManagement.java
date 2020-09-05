package vn.plusplus.javacore.lesson71;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
    private ArrayList <Employee> employees = new ArrayList<>();
    private ArrayList<Long> totalSalary = new ArrayList<>();
    private ArrayList<Long> totalOver = new ArrayList<>();


    //mang luu tru thong tin Employee
    public ArrayList <Employee> enterInformationEmployee() {
        Scanner enter = new Scanner(System.in);

        System.out.println(" How many Employee do you have? ");
        int numberOfEmployee = enter.nextInt();
        enter.nextLine();


        for (int i = 0; i < numberOfEmployee; i++) {
            System.out.println(" Enter informatino of the Employee number " + (i + 1) + ":");

            System.out.println("Employee name is: ");
            String name = enter.nextLine();

            System.out.println(" Employer age is: ");
            int age = enter.nextInt();

            System.out.println(" Is this Employee is a Fulltime position?: (true or false)");
            boolean isFullTime = enter.nextBoolean();
            enter.nextLine();
            if (isFullTime == true) {
                int overTimeDay;
                System.out.print("Số ngày làm thêm: ");
                overTimeDay = enter.nextInt();
                enter.nextLine();
                employees.add(new FulltimeEmployee(name, age, isFullTime, overTimeDay));
            } else {
                System.out.print("Số giờ làm việc: ");
                int time;
                time = enter.nextInt();
                enter.nextLine();
                employees.add(new ParttimeEmployee(name, age, isFullTime, time));
            }
        }
        return employees;

    }

    public void totalSalary() {

    }
}
