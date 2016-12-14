package lesson5.day2.abstraction;

//This is the OO (= good) way of computing areas
class Test {
    public static void main(String[] args) {

        ClosedCurve[] objects = {new Triangle(5, 5), new Square(3), new Circle(3)};

        //compute areas
        for (ClosedCurve cc : objects) {
            System.out.println(cc.computeArea());
        }
    }
}
