package strategymodel;

/**
 * 比较器管理者
 */
public class Context {

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 根据运行时传入的比较策略进行比较。
     * @param cat1 猫
     * @param cat2 猫
     */
    public void compareTo(Cat cat1, Cat cat2) {
        int i = this.strategy.compare(cat1, cat2);
        if (strategy instanceof WeightStrategy) {
            if (i > 0) {
                System.out.println("根据体重比较，较大的猫为：" + cat1.getName() + ", 体重为：" + cat1.getWeight());
            } else {
                System.out.println("根据体重比较，较大的猫为：" + cat2.getName() + ", 体重为：" + cat2.getWeight());
            }
        }

        if (strategy instanceof HeightStrategy) {
            if (i > 0) {
                System.out.println("根据身高比较，较大的猫为：" + cat1.getName() + ", 身高为：" + cat1.getWeight());
            } else {
                System.out.println("根据身高比较，较大的猫为：" + cat2.getName() + ", 身高为：" + cat2.getWeight());
            }
        }
    }
}
