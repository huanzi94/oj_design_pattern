package adaptermode.interfaceadapter;

/**
 * AbstractVoltage抽象类空实现PhoneVoltage接口中的所有的方法,
 * 供子类使用时选择性实现
 */
public abstract class AbstractVoltage implements PhoneVoltage {

    public AbstractVoltage() {
    }

    @Override
    public int outPut5V() {
        return 0;
    }

    @Override
    public int outPut18V() {
        return 0;
    }

    @Override
    public int outPut35V() {
        return 0;
    }
}
