package builderpattern;

/**
 * 牛肉百事可乐套餐建造者
 */
public class BeefPepsiKFCBuilder extends KFCBuilder {

    /**
     * 牛肉百事可乐套餐建造者
     *
     * @param hamburg 具体的汉堡。牛肉汉堡
     * @param drink   具体的饮料。百事可乐
     */
    public BeefPepsiKFCBuilder(Hamburg hamburg, Drink drink) {
        super(hamburg, drink);
    }

    @Override
    public void makingBurgers() {
        System.out.println("制作牛肉汉堡");
    }

    @Override
    public void makingDrink() {
        System.out.println("制作百事可乐");
    }

    @Override
    public void packaging() {
        System.out.println("打包牛肉汉堡+百事可乐套餐");
    }
}
