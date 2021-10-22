package factorymodel.factorymethodmodel;

public class Client {

    public static void main(String[] args) {
        ShapeFactory circleShapeFactory = new CircleShapeFactory();
        Shape circle = circleShapeFactory.getShape();
        circle.drawShape();

        ShapeFactory triangleShapeFactory = new TriangleShapeFactory();
        Shape triangle = triangleShapeFactory.getShape();
        triangle.drawShape();
    }
}
