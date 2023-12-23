package payrollsystem;

public class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private int hourlyWage;
    public PartTimeEmployee(String name, int id,int hoursWorked,int hourlyWage){
        super(name, id);
        this.hoursWorked=hoursWorked;
        this.hourlyWage=hourlyWage;
    }

    @Override
    public double calculateSalary() {
        return hourlyWage*hoursWorked;
    }
}
