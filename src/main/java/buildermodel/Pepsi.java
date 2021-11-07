package buildermodel;

/**
 * 百事可乐
 */
public class Pepsi extends Drink {
    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public String material() {
        return "糖";
    }
}
