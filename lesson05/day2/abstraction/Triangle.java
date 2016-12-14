package lesson5.day2.abstraction;

class Triangle extends ClosedCurve {
    final double base;
    final double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double computeArea() {
        return (0.5 * base * height);
    }
}
