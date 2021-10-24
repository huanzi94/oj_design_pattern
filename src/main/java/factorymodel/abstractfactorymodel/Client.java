package factorymodel.abstractfactorymodel;

public class Client {

    public static void main(String[] args) {
        AbstractShapeFactory shapeFactory = GenerateFactory.getFactory("Shape");
        Shape circle = shapeFactory.getShape("Circle");
        circle.drawShape();
        Shape triangle = shapeFactory.getShape("Triangle");
        triangle.drawShape();

        AbstractShapeFactory otherShapeFactory = GenerateFactory.getFactory("Other");
        Shape other = otherShapeFactory.getOther("Other");
        other.drawShape();
    }
}
