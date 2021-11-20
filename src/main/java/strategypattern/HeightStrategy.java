package strategypattern;

/**
 * 身高比较策略
 */
public class HeightStrategy implements Strategy {

    @Override
    public int compare(Cat cat1, Cat cat2) {
        return cat1.getHeight() > cat2.getHeight() ? 1 : 0;
    }
}
