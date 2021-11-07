package bridgingmode;

/**
 * 画图行为的接口定义的具体实现，圆形
 */
public class CircleDrawShape implements DrawShape {
    @Override
    public void drawShape() {
        System.out.println("画了一个圆形");
    }
}
