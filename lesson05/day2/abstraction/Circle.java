package lesson5.day2.abstraction;

final class Circle extends ClosedCurve {
    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double computeArea() {
        return (Math.PI * radius * radius);
    }
}
