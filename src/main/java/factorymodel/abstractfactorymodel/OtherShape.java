package factorymodel.abstrctfactorymodel;

/**
 * 其他图形工厂类的实现
 */
public class OtherShape implements Shape {

    @Override
    public void drawShape() {
        System.out.println("画了一个其他图形！~");
    }
}
