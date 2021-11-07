package buildermodel;

/**
 * 鸡肉汉堡
 */
public class ChickenHamburgers extends Hamburg {

    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public String material() {
        return "鸡肉";
    }
}
