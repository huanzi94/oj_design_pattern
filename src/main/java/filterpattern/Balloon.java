package filterpattern;

/**
 * 气球实体
 */
public class Balloon {

    private String shape;

    private int size;

    private String color;

    public Balloon(String shape, int size, String color) {
        this.shape = shape;
        this.size = size;
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Balloon{" +
                "shape='" + shape + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
