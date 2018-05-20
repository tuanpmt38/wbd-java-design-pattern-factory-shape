import shape.Shape;

public class FactoryPatterDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape s1 = shapeFactory.getShape("Circle");
        s1.draw();

        Shape s2 = shapeFactory.getShape("Rectangle");
        s2.draw();

        Shape s3 = shapeFactory.getShape("Squace");
        s3.draw();
    }
}
