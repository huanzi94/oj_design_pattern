package bridgingmode;

/**
 * 图形的抽象层定义
 */
public abstract class Shape {

    private DrawShape drawShape;

    public Shape(DrawShape drawShape) {
        this.drawShape = drawShape;
    }

    /**
     * 画图行为的定义
     */
    public void draw() {
        drawShape.drawShape();
    }
}
