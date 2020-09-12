package vn.plusplus.javacore.lesson81;

public class ParttimeEmployee extends Employee {

    private long MEAL_ALLOWANCE = 0; //nhan vien parttime khong co tro cap tien an
    private int totalWorkingShift; //Số ca làm việc
    private long baseSalary; //Lương theo ca làm việc

    public ParttimeEmployee(String name, int age, String identificationNunber) {
        super(name, age, identificationNunber);
    }


    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public long getSalaryRate() {
        return baseSalary;
    }

    @Override
    public long getWorkingCount() {
        return totalWorkingShift;
    }


    public ParttimeEmployee(String name, int age, String identificationNunber, int totalWorkingShift, long baseSalary) {
        super(name, age, identificationNunber);
        this.totalWorkingShift = totalWorkingShift;
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Nhan vien ban thoi gian (" +
                "Tien tro cap la: " + MEAL_ALLOWANCE +
                ", TOng so ca lam viec: " + totalWorkingShift +
                ", Luong theo ca lam viec: " + baseSalary +
                ')';
    }
}
