package facadepattern;

/**
 * 外观类，提供统一的接口
 */
public class ShapeMaker {

    private final Shape cricle;

    private final Shape triangle;

    private final Shape rhombus;

    public ShapeMaker() {
        this.cricle = new CricleShape();
        this.triangle = new TriangleShape();
        this.rhombus = new RhombusShape();
    }

    /**
     * 画圆形图形
     */
    public void drawCricleShape() {
        cricle.drawShape();
    }

    /**
     * 画菱形图形
     */
    public void drawRhombusShape() {
        rhombus.drawShape();
    }

    /**
     * 画三角形图形
     */
    public void drawTriangleShape() {
        triangle.drawShape();
    }
}
