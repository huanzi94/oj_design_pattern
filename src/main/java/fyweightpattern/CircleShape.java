package fyweightpattern;

public class CircleShape implements Shape{

    private final String color;

    private final double radius;

    public CircleShape(String color) {
        this.color = color;
        this.radius = Math.random();
    }

    @Override
    public void drawShape() {
        System.out.println("画了一个颜色为"+ color + "圆形图形，圆角为" + radius);
    }
}
