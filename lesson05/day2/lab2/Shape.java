package lesson5.day2.lab2;

public abstract class Shape {

    protected String shapeName;

    public String getShapeName() {
        return shapeName;
    }

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public String toString() {
        return shapeName;
    }

    abstract double computeArea();

    abstract double computePerimeter();

    abstract void readShapeData();
}
