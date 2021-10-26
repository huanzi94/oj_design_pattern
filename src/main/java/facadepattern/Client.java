package facadepattern;

public class Client {

    public static void main(String[] args) {

        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCricleShape();
        shapeMaker.drawRhombusShape();
        shapeMaker.drawTriangleShape();
    }
}
