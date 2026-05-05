package Ex03;

public class Employee {
	private String name;
    private double salary;

	public Employee(String name, double salary) {
		this.name = name;
        this.salary = salary;
	}
	public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Name: " + name + " Salary: " + salary;
    }
}
