package builderpattern;

/**
 * 汉堡套餐
 */
public class BurgerPackage {

    private Hamburg hamburg;
    private Drink drink;

    public BurgerPackage(Hamburg hamburg, Drink drink) {
        this.hamburg = hamburg;
        this.drink = drink;
    }

    public Hamburg getHamburg() {
        return hamburg;
    }

    public void setHamburg(Hamburg hamburg) {
        this.hamburg = hamburg;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "汉堡套餐{" + "hamburg=" + hamburg.name() + ", drink=" + drink.name() + '}';
    }
}
