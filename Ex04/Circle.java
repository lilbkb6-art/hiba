package Ex04;

public class Circle extends Shape {
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }
    public class TestShape {
	public static void main(String[] args) {
		 Shape r = new Rectangle(5, 3);
	        Shape c = new Circle(2);

	        System.out.println("Rectangle Area: " + r.area());
	        System.out.println("Rectangle Perimeter: " + r.perimeter());

	        System.out.println("Circle Area: " + c.area());
	        System.out.println("Circle Perimeter: " + c.perimeter());
	}
	}
	}

