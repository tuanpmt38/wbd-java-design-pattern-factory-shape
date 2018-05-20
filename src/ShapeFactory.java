import circle.Circle;
import rectangle.Rectangle;
import shape.Shape;
import squace.Squace;

public class ShapeFactory {
    public  Shape getShape(String type){
        if(type.equals("Circle")){
            return new Circle();
        }else if (type.equals("Rectangle")){
            return new Rectangle();
        }else {
            return new Squace();
        }
    }
}
