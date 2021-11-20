package decoratorpattern;

/**
 * 食材：红豆装饰者
 */
public class OrmosiaFoodstuffDecorator extends FoodstuffDecorator {

    public OrmosiaFoodstuffDecorator(Drink drink) {
        super(drink);
        setName("红豆");
        setPrice(11F);
        setDesc("加入了一份红豆");
    }
}
