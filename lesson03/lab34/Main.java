package lesson03.lab34;

class Main {
    
    static void main(String... args) {
        
        Rectangle rectangle = new Rectangle(4.2, 3.4);
        Triangle triangleA = new Triangle(5.2, 2.6);
        Triangle triangleB = new Triangle(5.2, 2.6, 4.2);
        Circle circle = new Circle(2.9);
        
        System.out.println("The area of Rectangle is " + rectangle.computeArea());
        System.out.println("The area of Triangle A is " + triangleA.computeArea());
        System.out.println("The area of Triangle B is " + triangleB.computeArea());
        System.out.println("The area of Circle is " + circle.computeArea());
    }
}
