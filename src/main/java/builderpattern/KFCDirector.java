package builderpattern;

/**
 * 指挥者，决定制作产品的流程步骤
 */
public class KFCDirector {

    KFCBuilder kfcBuilder;

    public KFCDirector(KFCBuilder kfcBuilder) {
        this.kfcBuilder = kfcBuilder;
    }

    public BurgerPackage build() {
        kfcBuilder.makingBurgers();
        kfcBuilder.makingDrink();
        kfcBuilder.packaging();
        return kfcBuilder.build();
    }
}
