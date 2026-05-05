package Ex02;

public class Student extends Person {
	   private double grade;
	public Student(String name, int age, double grade) {
		super(name, age);
        this.grade = grade;
	}
	  public boolean isPassed() {
	        return grade >= 10;
	    }

	    public String toString() {
	        return super.toString() + " Grade: " + grade;
	    }
	    public class TestStudent {
	public static void main(String[] args) {
		 Student s = new Student("hiba", 20, 12);

	        System.out.println(s);
	        System.out.println("Passed? " + s.isPassed());

	}

	}
    }
