package iteratorpattern;

import java.util.Iterator;

/**
 * 获取迭代器的接口
 */
public interface College{

    Iterator getIterator();

    default String getCollegeName() {
        return "XXX大学";
    }
}
