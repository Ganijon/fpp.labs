package lesson5.day2.abstraction;

public class Square extends ClosedCurve {
    final double side;

    Square(double side) {
        this.side = side;
    }

    double computeArea() {
        return (side * side);
    }
}
