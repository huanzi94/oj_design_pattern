package bridgingpattern;

/**
 * 画图行为的接口定义的具体实现，三角形
 */
public class TriangleDrawShape implements DrawShape {

    @Override
    public void drawShape() {
        System.out.println("画了一个三角形");
    }
}
