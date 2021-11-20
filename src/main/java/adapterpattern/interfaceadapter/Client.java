package adapterpattern.interfaceadapter;

public class Client {

    public static void main(String[] args) {
        // 第一种写法
        Phone phone = new Phone(new PhonePharger(new HouseholdVoltage()));
        phone.chargeWith5V();

        // 第二种写法
        HouseholdVoltage householdVoltage = new HouseholdVoltage();
        AbstractVoltage voltage = new AbstractVoltage() {
            @Override
            public int outPut5V() {
                System.out.println("使用接口适配器模式，第二种写法~~~");
                int vo = householdVoltage.outPut220V();
                return vo / 44;
            }
        };
        int phoneVoltage = voltage.outPut5V();
        System.out.println("使用接口适配器模式，第二种写法获得了" + phoneVoltage + "V电压，手机可以充电了。");
    }
}
