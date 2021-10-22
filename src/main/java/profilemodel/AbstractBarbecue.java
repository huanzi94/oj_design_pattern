package profilemode;

/**
 * 定义烧烤制作方法
 */
public abstract class AbstractBarbecue {

    /**
     * 生火
     */
    public abstract void stoker();

    /**
     * 准备食材
     */
    public abstract void prepare();

    /**
     * 烤制实物
     */
    public abstract void barbecue();

    /**
     * 享用
     */
    public abstract void taking();

    /**
     * 制作过程，
     */
    public final void making(){
        stoker();
        prepare();
        barbecue();
        taking();
    }
}
