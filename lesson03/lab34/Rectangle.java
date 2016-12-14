package lesson03.lab34;

class Rectangle {
    
    public double getWidth() {
        return width;
    }
    
    public double getLength() {
        return length;
    }
    
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    
    public double computeArea() {
        return width * length;
    }
    
    private double width;    
    private double length;
}

