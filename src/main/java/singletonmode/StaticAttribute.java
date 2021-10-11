package singletonmode;

public class StaticAttribute {

    private StaticAttribute() {
    }

    private final static StaticAttribute staticAttribute = new StaticAttribute();

    public static StaticAttribute getInstance() {
        return staticAttribute;
    }

}
