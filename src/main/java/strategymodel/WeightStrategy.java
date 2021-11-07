package strategymodel;

/**
 * 体重比较策略
 */
public class WeightStrategy implements Strategy {

    @Override
    public int compare(Cat cat1, Cat cat2) {
        return cat1.getWeight() > cat2.getWeight() ? 1 : 0;
    }
}
