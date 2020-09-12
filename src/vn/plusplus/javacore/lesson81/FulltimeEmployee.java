package vn.plusplus.javacore.lesson81;


public class FulltimeEmployee extends Employee {

    private long MEAL_ALLOWANCE = 2000000; //tro cap tien an cho nhan vien fulltime
    private int totalWorkingDays; //Số ngày làm việc
    private long dailySalary; //Lương theo ngày

    public FulltimeEmployee(String name, int age, String identificationNunber, int totalWorkingDays, long dailySalary) {
        super(name, age, identificationNunber);
        this.totalWorkingDays = totalWorkingDays;
        this.dailySalary = dailySalary;
    }

    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public long getSalaryRate() {
        return dailySalary;
    }

    @Override
    public long getWorkingCount() {
        return totalWorkingDays;
    }


    @Override
    public String toString() {
        return "Nhan vien toan thoi gian " + "(" +
                "Tien tro cap la: " + MEAL_ALLOWANCE +
                ", Tong so ngay lam viec: " + totalWorkingDays +
                ", luong theo ngay: " + dailySalary +
                ')';
    }
}
