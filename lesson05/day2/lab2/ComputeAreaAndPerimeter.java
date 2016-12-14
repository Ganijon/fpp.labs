package lesson5.day2.lab2;

import java.util.Scanner;

public class ComputeAreaAndPerimeter {

    public static void main(String[] args) {

        Shape shape = null;

        while (true) {
            shape = getShape();
            if (shape != null)
                break;
        }

        while (true) {
            try {
                shape.readShapeData();
            } catch (NumberFormatException ex) {
                System.out.println("Wrong input");
                continue;
            }
            break;
        }
        System.out.println(shape);
        System.out.println(String.format("The area is %1$.2f", shape.computeArea()));
        System.out.println(String.format("The perimeter is %1$.2f", shape.computePerimeter()));

    }

    public static Shape getShape() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter C for Circle");
        System.out.println("Enter R for Rectangle");
        System.out.println("Enter T for Triangle");

        String shapeType = scanner.next().toUpperCase();
        System.out.println(shapeType);
        
        if(shapeType.equals("C")) 
            return new Circle();
            
        if(shapeType.equals("R")) 
            return new Circle();
            
        if(shapeType.equals("T")) 
            return new RtTriangle();

        return null;
        
        
        /* strings in switch are not supported in java 1.5
        
        switch(shapeType) 
            case "C":
                return new Circle();
            case "R":
                return new Rectangle();
            case "T":
                return new RtTriangle();
            default:
                return null;
        }
        */
    }
}
