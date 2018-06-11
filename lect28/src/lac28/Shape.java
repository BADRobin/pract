package lac28;

public abstract class Shape {
    private double size;

    public Shape(double size) {
        this.size = size;
    }


    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public abstract double calcArea();
}
