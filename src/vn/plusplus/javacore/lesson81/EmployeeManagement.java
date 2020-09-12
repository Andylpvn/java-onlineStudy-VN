package vn.plusplus.javacore.lesson81;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {

    private int n; //tong so nhan vien
    public ArrayList<Employee> Employees = new ArrayList<>(); //mang danh sach nhan vien
    public ArrayList<Employee> TopSalary = new ArrayList<>();  //mang danh sach nhan vien co tien luong cao nhat
    public ArrayList<Employee> LeastSalary = new ArrayList<>();  //mang danh sach nhan vien co tien luong thap nhat


    //Khởi tạo với đối số truyền vào là tổng số nhân viên cần quản lý n
    public EmployeeManagement(int n) {
        this.n = n;
    }

    //Nhập thông tin cho từng nhân viên (Khi nhập thì đưa ra lựa chọn để nhập nhân viên fulltime, parttime)
    Scanner input = new Scanner(System.in);

    public ArrayList<Employee> inputInformation() {
        System.out.println("Nhap thong tin nhan vien: ");

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin nhan vien thu  " + (i + 1) + ":");

            System.out.println("Ten cua nhan vien la: ");
            String name = input.nextLine();

            System.out.println("Tuoi cua nhan vien la: ");
            int age = input.nextInt();

            System.out.println("Ma so nhan vien la: ");
            String identificationNumber = input.nextLine();

            System.out.println("Nhan vien parttime nhap 0 va fulltime nhap 1");
            int status = input.nextInt();

            //nhap tong tin nhan vien parttime
            if (status == 0) {

                System.out.println("So ca lam viec la: ");
                int totalWorkingShift = input.nextInt();
                input.nextLine();

                System.out.println("Luong theo ca lam viec la: ");
                long baseSalary = input.nextLong();
                input.nextLine();

                Employee parttimeEmployee = new ParttimeEmployee(name, age, identificationNumber, totalWorkingShift, baseSalary);
                Employees.add(parttimeEmployee);

                //nhap thong tin nhan vien fultime
            } else {

                System.out.println("So ngay lam viec la: ");
                int totalWorkingDays = input.nextInt();
                input.nextLine();

                System.out.println("Luong theo ngay lam viec la: ");
                long dailySalary = input.nextLong();
                input.nextLine();

                Employee fulltimeEmployee = new FulltimeEmployee(name, age, identificationNumber, totalWorkingDays, dailySalary);
                Employees.add(fulltimeEmployee);
            }


        }
        return Employees;

    }

    public void maxSalary() {
        long max = 0;
        for (Employee nv : Employees) {
            if (nv.calculateSalary() >= max) {
                max = nv.calculateSalary();
            }
        }
        for (Employee nv : Employees) {
            if (nv.calculateSalary() == max) {
                max = nv.calculateSalary();
                TopSalary.add(nv);
            }
        }
        for (Employee nv : TopSalary) {
            System.out.println(nv.toString());
            System.out.println("Tong luong cua nhan vien nay la: " + max);
        }
    }

    public void minSalary(){
        long min=Employees.get(0).calculateSalary();
        for (Employee nv:Employees){
            if(nv.calculateSalary()<=min){
                min =nv.calculateSalary();
            }
        }
        for (Employee nv: Employees){
            if(min ==nv.calculateSalary()){
                LeastSalary.add(nv);
            }
        }
        for(Employee x: LeastSalary ){
            System.out.println(x.toString());
            System.out.println("Tong luong cua nhan vien nay la: " +min);
        }
    }
}
