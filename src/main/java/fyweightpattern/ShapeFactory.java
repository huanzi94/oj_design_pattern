package fyweightpattern;

import java.util.HashMap;

/**
 * 图形工厂
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> shapeMap = new HashMap<>();

    /**
     * 获取一个图形，如果这个图形之前已经创建过，那么直接从缓存中返回，没有则重新创建。
     * @param color 颜色
     * @return 图形
     */
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
