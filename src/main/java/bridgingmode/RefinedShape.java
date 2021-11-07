package bridgingmode;

/**
 * 图形的抽象层定义的实现，重新定义了图形的行为规则
 */
public class RefinedShape extends Shape {

    private int x, y;

    public RefinedShape(int x, int y, DrawShape drawShape) {
        super(drawShape);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("我是Shape实现类，即将画一个" + x + "," + y + "的图形");
        super.draw();
    }
}
