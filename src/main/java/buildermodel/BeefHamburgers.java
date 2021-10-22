package buildermodel;

/**
 * 牛肉汉堡
 */
public class BeefHamburgers extends Hamburg{

    @Override
    public String name() {
        return "牛肉汉堡";
    }

    @Override
    public String material() {
        return "牛肉";
    }
}
