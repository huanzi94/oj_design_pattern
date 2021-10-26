package facadepattern;

/**
 * 三角形图形的具体实现
 */
public class TriangleShape extends Shape{
    @Override
    protected void drawShape() {
        System.out.println("画了一个三角形图形！");
    }
}
