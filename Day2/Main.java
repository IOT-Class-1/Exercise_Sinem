package merve_gündoğmuş.Day2;

public class Main {
    public static void main(String[] args) {

        Engineer employeeOne = new Engineer("Sinem Çolak", 30000, 23);
        SalesPerson employeeTwo = new SalesPerson("Tuba Akpınar", 40000, 32, .25);

        employeeOne.getAnnualBonus();
        employeeTwo.raiseSalary();
        employeeTwo.getCommissionPercentage();

        System.out.println(employeeOne.salary);
        System.out.println(employeeOne.getAnnualBonus());
        System.out.println(employeeTwo.salary);
        System.out.println(employeeTwo.getCommissionPercentage());
    }
}
