package decoratormodel;

/**
 * 具体的单品，奶茶，也是被装饰者。
 */
public class MilkyTea extends Drink {
    public MilkyTea() {
        setName("奶茶");
        setPrice(20.8F);
        setDesc("点了一份奶茶");
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
