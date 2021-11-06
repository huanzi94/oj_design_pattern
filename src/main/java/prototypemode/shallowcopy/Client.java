package prototypemode.shallowcopy;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("多利", "white ", new Sheep());

        Sheep clonersSheepA = (Sheep) sheep.clone();
        Sheep clonersSheepB = (Sheep) sheep.clone();
        System.out.println("原型羊：" + sheep + " 属性sheep的hashcode: " + sheep.getSheep().hashCode());
        System.out.println("克隆羊A：" + clonersSheepA + " 属性sheep的hashcode: " + clonersSheepA.getSheep().hashCode());
        System.out.println("克隆羊B：" + clonersSheepB + " 属性sheep的hashcode: " + clonersSheepB.getSheep().hashCode());
    }
}
