package factorymodel.factorymethodmodel;

/**
 * 圆形对应的工厂类
 */
public class CircleShapeFactory extends ShapeFactory {

    @Override
    public Shape getShape() {
        return new CircleShape();
    }
}
