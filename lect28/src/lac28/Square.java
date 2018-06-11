package lac28;

public class Square extends Shape {
    public Square(double side){
        super(side);
    }
    @Override
    public double calcArea () {
        return getSize()*getSize();
    }
}
