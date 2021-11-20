package singletonpattern;

/**
 * DCL单例
 */
public class DoubleCheckLock {

    private static volatile DoubleCheckLock doubleCheckLock = null;

    private DoubleCheckLock() {
    }

    public static DoubleCheckLock getInstance() {
        if (doubleCheckLock == null) {
            synchronized (DoubleCheckLock.class) {
                if (doubleCheckLock == null) {
                    doubleCheckLock = new DoubleCheckLock();
                }
            }
        }

        return doubleCheckLock;
    }
}
