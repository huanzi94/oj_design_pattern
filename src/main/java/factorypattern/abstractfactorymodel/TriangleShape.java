package factorypattern.abstractfactorymodel;

/**
 * 图形接口的实现，定义了具体的三角形
 */
public class TriangleShape implements Shape {

    @Override
    public void drawShape() {
        System.out.println("画了一个三角形~");
    }
}
