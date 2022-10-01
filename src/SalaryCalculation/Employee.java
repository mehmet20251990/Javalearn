package SalaryCalculation;

public class Employee {

    String name;
    int salary;
    int workHours;
    int year;

    public Employee(String name, int salary, int workHours, int year) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.year = year;
    }

    public  double tax() {

        double paymentoftax = 0;

        if (salary<10000){
            paymentoftax =0;
        }else {
            paymentoftax = salary*0.03;
        }
        return paymentoftax;
    }
    public int bonus(){

        int paymentofbonus = 0;
        int additionalbonus = 50;

        if (workHours>40){
            paymentofbonus = (workHours-40)*additionalbonus;
        }
        return paymentofbonus;
    }
    public double raiseSalary() {

        int timeOfYear = 2021;
        int sumOfYear = timeOfYear - year;
        double raising = 0;

        if (sumOfYear<5){
            raising = (salary+tax())*0.05;
        } else if (sumOfYear<15) {
            raising = (salary+tax())*0.1;

        }else {
            raising = (salary+tax())*0.2;
        }
        return raising;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", year=" + year +
                '}';
    }
}
