package buildermodel;

/**
 * 鸡肉可口可乐套餐建造者
 */
public class ChickenCokeKFCBuilder extends KFCBuilder {

    /**
     * 鸡肉可口可乐套餐建造者
     *
     * @param hamburg 具体的汉堡。鸡肉汉堡
     * @param drink   具体的饮料。可口可乐
     */
    public ChickenCokeKFCBuilder(Hamburg hamburg, Drink drink) {
        super(hamburg, drink);
    }

    @Override
    public void makingBurgers() {
        System.out.println("制作鸡腿汉堡");
    }

    @Override
    public void makingDrink() {
        System.out.println("制作可口可乐");
    }

    @Override
    public void packaging() {
        System.out.println("打包鸡腿汉堡+可口可乐套餐");
    }
}
