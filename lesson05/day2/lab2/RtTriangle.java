package lesson5.day2.lab2;

import java.util.Scanner;

public class RtTriangle extends Shape {

    private double base;
    private double height;

    public RtTriangle() {
        super("Right Triangle");
    }

    public RtTriangle(double base, double height) {
        this();
        this.base = base;
        this.height = height;
    }

    public String toString() {
        return String.format("Shape is %s  base is %s  height is %s", super.toString(), base, height);
    }

    public double computeArea() {
        return 0.5 * base * height;
    }

    public double computePerimeter() {
        return base + height + Math.sqrt(base * base + height * height);
    }

    public void readShapeData() {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the base of Right Triangle:");
        base = Double.parseDouble(scanner.next());

        System.out.println("Enter the height of Right Triangle:");
        height = Double.parseDouble(scanner.next());
    }
}
