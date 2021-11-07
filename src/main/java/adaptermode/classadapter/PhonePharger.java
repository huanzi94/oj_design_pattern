package adaptermode.classadapter;

/**
 * 手机充电器，相当于是适配器，用于将将220V转化为手机能用的5V电压
 */
public class PhonePharger extends HouseholdVoltage implements PhoneVoltage {

    @Override
    public int outPut5V() {
        System.out.println("使用类适配器模式~~~");
        int voltage = outPut220V();
        return voltage / 44;
    }
}
