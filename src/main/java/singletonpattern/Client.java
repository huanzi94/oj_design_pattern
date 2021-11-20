package singletonpattern;

public class Client {

    public static void main(String[] args) {
        DoubleCheckLock doubleCheckLock = DoubleCheckLock.getInstance();
        DoubleCheckLock doubleCheckLock1 = DoubleCheckLock.getInstance();
        System.out.println(doubleCheckLock == doubleCheckLock1);

        StaticAttribute staticAttribute = StaticAttribute.getInstance();
        StaticAttribute staticAttribute1 = StaticAttribute.getInstance();
        System.out.println(staticAttribute == staticAttribute1);

        StaticInnerClass staticInnerClass = StaticInnerClass.getInstance();
        StaticInnerClass staticInnerClass1 = StaticInnerClass.getInstance();
        System.out.println(staticInnerClass == staticInnerClass1);
    }
}
