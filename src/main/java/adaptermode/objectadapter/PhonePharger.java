package adaptermode.objectadapter;

/**
 * 手机充电器，相当于是适配器，用于将将220V转化为手机能用的5V电压
 */
public class PhonePharger implements PhoneVoltage {

    private HouseholdVoltage householdVoltage;

    public PhonePharger() {
        this.householdVoltage = new HouseholdVoltage();
    }

    @Override
    public int outPut5V() {
        System.out.println("使用对象适配器模式~~~");
        int voltage = householdVoltage.outPut220V();
        return voltage / 44;
    }
}
