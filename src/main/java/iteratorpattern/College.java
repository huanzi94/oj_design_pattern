package iteratorpattern;

import java.util.Iterator;

/**
 * 获取迭代器的接口
 */
public interface College {

    /**
     * 获取迭代器
     *
     * @return 迭代器
     */
    Iterator getIterator();

    /**
     * 大学名称
     */
    default String getCollegeName() {
        return "XXX大学";
    }
}
