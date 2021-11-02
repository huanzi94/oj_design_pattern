package fyweightpattern;

import java.util.HashMap;

public class ShapeFactory {

    private static final HashMap<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String color) {
        Shape shape = shapeMap.get(color);

        if (shape instanceof CircleShape) {
            return shape;
        }

        Shape circle = new CircleShape(color);
        shapeMap.put(color, circle);
        return circle;
    }
}
