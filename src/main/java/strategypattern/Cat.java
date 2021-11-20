package strategypattern;

/**
 * 实体类
 */
public class Cat {

    private final int height;
    private final int weight;
    private final String name;

    public Cat(int height, int weight, String name) {
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
