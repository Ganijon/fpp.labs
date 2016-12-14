package lesson5.day2.lab2;

import java.util.Scanner;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle() {
        super("Rectangle");
    }

    public Rectangle(int width, int height) {
        this();
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return String.format("Shape is %s  width is %s  height is %s", super.toString(), width, height);
    }

    public double computeArea() {
        return width * height;
    }

    public double computePerimeter() {
        return 2 * (width + height);
    }

    public void readShapeData() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width of Rectangle:");
        width = Integer.parseInt(scanner.next());

        System.out.println("Enter the height of Rectangle:");
        height = Integer.parseInt(scanner.next());
    }
}
