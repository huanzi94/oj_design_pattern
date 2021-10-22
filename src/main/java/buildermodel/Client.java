package buildermodel;

public class Client {

    public static void main(String[] args) {
        ChickenCokeKFCBuilder chickenCokeKFCBuilder = new ChickenCokeKFCBuilder(new ChickenHamburgers(), new Coke());
        KFCDirector kfcDirector = new KFCDirector(chickenCokeKFCBuilder);
        BurgerPackage burgerPackage = kfcDirector.build();
        System.out.println(burgerPackage);
        System.out.println("============================================");
        BeefPepsiKFCBuilder beefPepsiKFCBuilder = new BeefPepsiKFCBuilder(new BeefHamburgers(), new Pepsi());
        KFCDirector kfcDirector1 = new KFCDirector(beefPepsiKFCBuilder);
        BurgerPackage burgerPackage1 = kfcDirector1.build();
        System.out.println(burgerPackage1);
    }
}
