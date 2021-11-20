package singletonpattern;

/**
 * 类变量单例
 */
public class StaticAttribute {

    private final static StaticAttribute staticAttribute = new StaticAttribute();

    private StaticAttribute() {
    }

    public static StaticAttribute getInstance() {
        return staticAttribute;
    }

}
