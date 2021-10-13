package factorymodel.abstrctfactorymodel;

/**
 * 画图的工厂类，根据传入的类型，创建不同的图形对象
 */
public abstract class AbstractShapeFactory {

    /**
     * 根据传入的类型，创建不同的图形对象
     *
     * @return 具体的图形
     */
    public abstract Shape getShape(String shapeType);

    /**
     * 根据传入的类型，创建不同的图形对象
     *
     * @return 具体的图形
     */
    public abstract Shape getOther(String shapeType);
}
