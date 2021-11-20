package visitorpattern;

/**
 * 硬件接口
 */
public abstract class HardWare {

    int result = 1;

    public HardWare() {
    }

    /**
     * 计算算法
     */
    public void run() {
        System.out.println("1 + 1 = " + result);
    }

    /**
     * 接受一个访问者，以便访问者来访问它内部的数据结构
     *
     * @param visitor 访问者
     */
    abstract void accept(Visitor visitor);
}
