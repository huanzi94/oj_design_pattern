package adaptermode.interfaceadapter;

/**
 * 手机电压接口
 */
public interface PhoneVoltage {

    /**
     * 手机电压输出方法
     *
     * @return int
     */
    int outPut5V();

    /**
     * 其他电器电压输出方法
     *
     * @return int
     */
    int outPut18V();

    /**
     * 其他电器电压输出方法
     *
     * @return int
     */
    int outPut35V();
}
