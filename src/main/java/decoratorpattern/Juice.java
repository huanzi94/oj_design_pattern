package decoratorpattern;

/**
 * 具体的单品，果汁，也是被装饰者。
 */
public class Juice extends Drink {
    public Juice() {
        setName("果汁");
        setPrice(23.8F);
        setDesc("点了一份果汁");
    }

    @Override
    public float cost() {
        return super.getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "价格为：" + super.getPrice();
    }
}
