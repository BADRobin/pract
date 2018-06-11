package lac28;

public class Circle extends Shape {
    public Circle (double radius){
        super(radius);
    }
    @Override
    public double calcArea () {
        return Math.PI*getSize()*getSize();
    }
}
