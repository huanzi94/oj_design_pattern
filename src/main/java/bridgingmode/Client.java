package bridgingmode;

public class Client {

    public static void main(String[] args) {
        Shape refinedShape = new RefinedShape(1,2,new CircleDrawShape());
        refinedShape.draw();

        Shape refinedShape1 = new RefinedShape(3,1,new TriangleDrawShape());
        refinedShape1.draw();
    }
}
