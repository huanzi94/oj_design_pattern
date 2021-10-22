package buildermodel;

/**
 * 可口可乐
 */
public class Coke extends Drink{
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public String material() {
        return "糖";
    }
}
