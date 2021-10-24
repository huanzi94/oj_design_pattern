package factorymodel.abstractfactorymodel;

/**
 * 图形工厂类
 */
public class ShapeFactory extends AbstractShapeFactory{

    @Override
    public Shape getShape(String shapeType) {

        if (shapeType.equals("Circle")) {
            return new CircleShape();
        } else if (shapeType.equals("Triangle")) {
            return new TriangleShape();
        } else {
            return null;
        }
    }

    @Override
    public Shape getOther(String shapeType) {
        return null;
    }
}
