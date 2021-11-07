package factorymodel.simplefactorymodel;

/**
 * 画图的工厂类，根据传入的类型，创建不同的图形对象
 */
public class ShapeFactory {

    /**
     * 根据传入的类型，创建不同的图形对象
     *
     * @param shapeType 类型
     * @return 具体的图形
     */
    public Shape getShape(String shapeType) {

        if (shapeType.equals("Circle")) {
            return new CircleShape();
        } else if (shapeType.equals("Triangle")) {
            return new TriangleShape();
        } else {
            return null;
        }
    }
}
