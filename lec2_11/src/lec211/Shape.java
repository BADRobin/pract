package lec211;

import javafx.scene.shape.Circle;
import org.omg.CORBA.DynAnyPackage.Invalid;

import java.awt.*;

public abstract class Shape {
    private String shapeCode;
    private String shapeColor;

    public String getShapeColor() {
        return shapeCode;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }
    public abstract double calcArea();

//    @Override
//    public String toString (){
//        return "Shape"
//    }
        public static Shape parseShape (String s) throws InvalidShapeStringExeption {
            String[] split = s.split(":");
            if (split.length<2) throw new InvalidShapeStringExeption(s);
            switch (split[0]){
                case "Rectangle": return Rectangle.parseShepe(s);
                case "Circle" : return Circle.parseSgepe(s);

            }
        }

}
