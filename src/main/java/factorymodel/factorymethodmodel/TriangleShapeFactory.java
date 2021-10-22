package factorymodel.factorymethodmodel;

public class TriangleShapeFactory extends ShapeFactory{

    @Override
    public Shape getShape() {
        return new TriangleShape();
    }
}
