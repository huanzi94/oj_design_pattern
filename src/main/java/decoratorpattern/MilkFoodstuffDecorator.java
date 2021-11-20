package decoratorpattern;

/**
 * 食材：牛奶装饰者
 */
public class MilkFoodstuffDecorator extends FoodstuffDecorator {


    public MilkFoodstuffDecorator(Drink drink) {
        super(drink);
        setName("牛奶");
        setPrice(11F);
        setDesc("加入了一份牛奶");
    }
}
