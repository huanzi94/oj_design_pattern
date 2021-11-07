package decoratormodel;

/**
 * 具体的单品，可乐，也是被装饰者。
 */
public class Coke extends Drink {

    public Coke() {
        setName("可乐");
        setPrice(11.8F);
        setDesc("点了一份单品可乐");
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
