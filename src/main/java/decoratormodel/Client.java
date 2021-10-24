package decoratormodel;

public class Client {

    public static void main(String[] args) {

        /**
         * 饮料套餐：可乐，加了2份牛奶1份水果
         */
        Drink coke = new Coke();
        coke = new MilkFoodstuffDecorator(coke);
        coke = new MilkFoodstuffDecorator(coke);

        coke = new FruitFoodstuffDecorator(coke);
        System.out.println(coke.getDesc());
        System.out.println("最终价格为：" + coke.cost());

    }
}
