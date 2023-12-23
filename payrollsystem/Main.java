package payrollsystem;

public class Main {
    public static void main(String[] args) {
        PayrollSystem p1 = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee(5000.34, "Sakib", 1);
        PartTimeEmployee emp2 = new PartTimeEmployee("Akib", 2, 15, 25);
        p1.addEmployee(emp1);
        p1.addEmployee(emp2);
        System.out.println("Initial Employee details:");
        p1.displayEmployee();
        p1.removeEmployee(2);
        System.out.println("remaining employee details:");
        p1.displayEmployee();
    }
}