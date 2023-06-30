package ProjectAssignment;

import java.util.Scanner;

	class AreaCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Area Calculator");
	        System.out.println("-------------------");
	        System.out.println("Select a shape:");
	        System.out.println("1. Rectangle");
	        System.out.println("2. Circle");
	        System.out.println("3. Triangle");
	        System.out.println("-------------------");

	        int choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                calculateRectangleArea(scanner);
	                break;
	            case 2:
	                calculateCircleArea(scanner);
	                break;
	            case 3:
	                calculateTriangleArea(scanner);
	                break;
	            default:
	                System.out.println("Invalid choice!");
	                break;
	        }

	        scanner.close();
	    }

	    private static void calculateRectangleArea(Scanner scanner) {
	        System.out.print("Enter the length: ");
	        double length = scanner.nextDouble();

	        System.out.print("Enter the width: ");
	        double width = scanner.nextDouble();

	        double area = length * width;
	        System.out.println("The area of the rectangle is: " + area);
	    }

	    private static void calculateCircleArea(Scanner scanner) {
	        System.out.print("Enter the radius: ");
	        double radius = scanner.nextDouble();

	        double area = Math.PI * radius * radius;
	        System.out.println("The area of the circle is: " + area);
	    }

	    private static void calculateTriangleArea(Scanner scanner) {
	        System.out.print("Enter the base: ");
	        double base = scanner.nextDouble();

	        System.out.print("Enter the height: ");
	        double height = scanner.nextDouble();

	        double area = 0.5 * base * height;
	        System.out.println("The area of the triangle is: " + area);
	    }
	

}
