package strategypattern;

public class Client {

    public static void main(String[] args) {
        Cat tom = new Cat(10, 20, "Tom");
        Cat mimi = new Cat(15, 15, "MIMI");
        HeightStrategy heightStrategy = new HeightStrategy();
        Context context = new Context();
        context.setStrategy(heightStrategy);
        context.compareTo(tom, mimi);

        WeightStrategy weightStrategy = new WeightStrategy();
        context.setStrategy(weightStrategy);
        context.compareTo(tom, mimi);
    }
}
