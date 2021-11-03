package strategymodel;

/**
 * 策略接口
 */
public interface Strategy {

    /**
     * 提供一个比较器方法
     * @param cat1 猫
     * @param cat2 猫
     * @return 比较结果
     */
    int compare(Cat cat1, Cat cat2);
}
