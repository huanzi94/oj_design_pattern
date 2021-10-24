package decoratormodel;

/**
 * 食材：水果装饰者
 */
public class FruitFoodstuffDecorator extends FoodstuffDecorator {

    public FruitFoodstuffDecorator(Drink drink) {
        super(drink);
        setName("水果");
        setPrice(11F);
        setDesc("加入了一份水果！");
    }
}
