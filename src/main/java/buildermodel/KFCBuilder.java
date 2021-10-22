package buildermodel;

/**
 * 肯德基套餐制作
 */
public abstract class KFCBuilder {

    private Hamburg hamburg;
    private Drink drink;

    public KFCBuilder(Hamburg hamburg, Drink drink) {
        this.hamburg = hamburg;
        this.drink = drink;
    }

    /**
     * 制作汉堡
     */
    public abstract void makingBurgers();

    /**
     * 制作饮料
     */
    public abstract void makingDrink();

    /**
     * 打包
     */
    public abstract void packaging();

    /**
     * 返回一个制作好的套餐
     * @return BurgerPackage
     */
    public BurgerPackage build() {
        return new BurgerPackage(hamburg, drink);
    }
}
