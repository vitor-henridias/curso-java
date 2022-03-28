package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double grossSalary() {
		return grossSalary - tax;
	}
	
	public void updateSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0; 
	}

	public String toString() {
		return name + ", $ "  + String.format("%.2f", grossSalary());				
	}
}