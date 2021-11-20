package adapterpattern.interfaceadapter;

/**
 * 手机充电器，相当于是适配器，用于将将220V转化为手机能用的5V电压
 */
public class PhonePharger extends AbstractVoltage {

    private final HouseholdVoltage householdVoltage;

    public PhonePharger(HouseholdVoltage householdVoltage) {
        this.householdVoltage = householdVoltage;
    }

    @Override
    public int outPut5V() {
        System.out.println("使用接口适配器模式~~~");
        int voltage = 0;
        if (householdVoltage != null) {
            voltage = householdVoltage.outPut220V();
        }
        return voltage / 44;
    }
}
