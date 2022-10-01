package SalaryCalculation;

public class Runner {
    public static void main(String[] args) {


        Employee employee = new Employee("Drake", 1000, 41, 2020);
        System.out.println("Ödenecek vergi: "+employee.tax()+" $");
        System.out.println("Ödenecek bonus: "+employee.bonus()+" $");
        System.out.println("Maaş artışı: "+employee.raiseSalary()+" $");

        System.out.println("Toplam ödenecek ücret: "+(employee.salary+ employee.raiseSalary()));


    }
}