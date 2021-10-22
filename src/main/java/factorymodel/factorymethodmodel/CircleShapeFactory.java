package factorymodel.factorymethodmodel;

public class CircleShapeFactory extends ShapeFactory{

    @Override
    public Shape getShape() {
        return new CircleShape();
    }
}
