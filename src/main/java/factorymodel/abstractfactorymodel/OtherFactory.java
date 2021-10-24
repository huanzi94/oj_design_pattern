package factorymodel.abstractfactorymodel;

/**
 * 其他图形的工厂类
 */
public class OtherFactory extends AbstractShapeFactory {
    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Shape getOther(String shapeType) {
        if (shapeType.equals("Other")) {
            return new OtherShape();
        } else {
            return null;
        }
    }
}
