package payrollsystem;

public class FullTimeEmployee extends Employee {
  private double monthlySalary;
  public FullTimeEmployee(double monthlySalary, String name, int id){
      super(name,id);
      this.monthlySalary=monthlySalary;

  }

    @Override
    public double calculateSalary() {
       return monthlySalary;
    }
}
