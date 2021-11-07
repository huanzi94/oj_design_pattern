package decoratormodel;

/**
 * 装饰者抽象层，提取了一些公共内容。
 */
public abstract class FoodstuffDecorator extends Drink {

    private Drink drink;

    public FoodstuffDecorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDesc() {
        return drink.getDesc() + "\n" + super.getDesc() + "价格为：" + super.getPrice();
    }
}
