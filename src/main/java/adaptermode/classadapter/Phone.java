package adaptermode.classadapter;

/**
 * 手机使用类，
 */
public class Phone {

    private PhonePharger phonePharger;

    /**
     * 构造函数，需要传入PhonePharger对象
     *
     * @param phonePharger 手机充电器对象
     */
    public Phone(PhonePharger phonePharger) {
        this.phonePharger = phonePharger;
    }

    /**
     * 手机充电方法，必须使用5V的电压才能给手机充电
     */
    public void chargeWith5V() {
        int phoneVoltager = phonePharger.outPut5V();
        if (phoneVoltager != 5) {
            System.out.println("电压大于5V,手机爆炸了~~~");
            return;
        }
        System.out.println("手机充电中，使用电压为：" + phoneVoltager + "V~~");
    }
}
