package facadepattern;

/**
 * 圆形图形的具体实现
 */
public class CricleShape extends Shape {
    @Override
    protected void drawShape() {
        System.out.println("画了一个圆形图形！");
    }
}
