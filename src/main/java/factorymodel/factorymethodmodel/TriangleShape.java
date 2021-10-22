package factorymodel.factorymethodmodel;

/**
 * 图形接口的实现，定义了具体的圆形
 */
public class TriangleShape implements Shape {

    @Override
    public void drawShape() {
        System.out.println("画了一个三角形~");
    }
}
