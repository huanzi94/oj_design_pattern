package prototypemode.deepcopy;

import java.io.*;

/**
 * 原型羊的定义
 */
public class Sheep implements Serializable, Cloneable {

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

        Sheep sheep = null;

        // 方式一，先利用clone()拷贝非对象数据类型，再处理对象：
        // sheep = (Sheep) super.clone();
        // sheep.sheep = new Sheep();

        // 方式二，利用序列化和反序列化进行处理。：
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            sheep = (Sheep) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                assert ois != null;
                ois.close();
                bis.close();
                oos.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return sheep;
    }

    @Override
    public String toString() {
        return "Sheep{" + "name='" + name + '\'' + ", color='" + color + '\'' + ", sheep=" + sheep + '}';
    }
}
