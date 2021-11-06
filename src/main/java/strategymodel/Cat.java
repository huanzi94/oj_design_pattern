package strategymodel;

/**
 * 实体类
 */
public class Cat {

    private int height;
    private int weight;
    private String name;

    public Cat(int height, int weight, String name) {
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
