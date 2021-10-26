package facadepattern;

/**
 * 菱形图形的具体实现
 */
public class RhombusShape extends Shape {
    @Override
    protected void drawShape() {
        System.out.println("画了一个菱形图形！");
    }
}
