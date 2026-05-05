package Ex03;

public class Manager extends Employee {
	private double bonus;
	public Manager(String name, double salary, double bonus) {
		super(name, salary);
        this.bonus = bonus;
	}
	public double getTotalSalary() {
        return getSalary() + bonus;
    }

    public String toString() {
        return super.toString() + " Bonus: " + bonus +
               " Total: " + getTotalSalary();
    }
    public class TestEmployee {
	public static void main(String[] args) {
		Manager m = new Manager("yaçine", 50000, 10000);

        System.out.println(m);
    }
    }

	}

