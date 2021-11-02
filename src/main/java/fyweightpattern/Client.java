package fyweightpattern;

public class Client {

    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("RED");
        shape.drawShape();

        Shape shape1 = ShapeFactory.getShape("RED");
        shape1.drawShape();
    }
}
