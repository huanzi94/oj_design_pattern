package factorypattern.factorymethodmodel;

/**
 * 三角形对应的工厂类
 */
public class TriangleShapeFactory extends ShapeFactory {

    @Override
    public Shape getShape() {
        return new TriangleShape();
    }
}
