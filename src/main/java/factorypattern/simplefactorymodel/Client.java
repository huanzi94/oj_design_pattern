package factorypattern.simplefactorymodel;

public class Client {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("Circle");
        circle.drawShape();

        Shape triangle = shapeFactory.getShape("Triangle");
        triangle.drawShape();
    }
}
