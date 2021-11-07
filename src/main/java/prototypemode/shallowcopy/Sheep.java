package prototypemode.shallowcopy;

/**
 * 原型羊的定义
 */
public class Sheep implements Cloneable {

    private String name;
    private String color;
    private Sheep sheep;

    public Sheep() {

    }

    public Sheep(String name, String color, Sheep sheep) {
        this.name = name;
        this.color = color;
        this.sheep = sheep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sheep getSheep() {
        return sheep;
    }

    public void setSheep(Sheep sheep) {
        this.sheep = sheep;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Sheep{" + "name='" + name + '\'' + ", color='" + color + '\'' + ", sheep=" + sheep + '}';
    }
}
