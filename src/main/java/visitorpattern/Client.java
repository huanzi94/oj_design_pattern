package visitorpattern;

public class Client {

    public static void main(String[] args) {
        Robot robot = new Robot(new Cpu());
        robot.calc();

        System.out.println("--------------软件包升级--------------");
        robot.accept(new UpdatePackagesVisitor());
        robot.calc();
    }
}
