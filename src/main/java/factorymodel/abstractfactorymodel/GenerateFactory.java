package factorymodel.abstrctfactorymodel;

/**
 * 工厂包装类
 */
public class GenerateFactory {

    /**
     * 根据不行的工厂类型，获取对应的工厂类
     * @param factoryType 工厂类型
     * @return 具体的工厂类
     */
    public static AbstractShapeFactory getFactory(String factoryType) {
        if (factoryType.equals("Shape")) {
            return new ShapeFactory();
        } else if (factoryType.equals("Other")) {
            return new OtherFactory();
        } else {
            return null;
        }
    }
}
