package singletonmode;

/**
 * 静态内部类
 */
public class StaticInnerClass {

    private StaticInnerClass() {
    }

    public static StaticInnerClass getInstance() {
        return InnerClass.staticInnerClass;
    }

    private static class InnerClass {
        private final static StaticInnerClass staticInnerClass = new StaticInnerClass();
    }

}
