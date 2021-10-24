package profilemodel;

/**
 * 烤红薯
 */
public class RoastedSweetPotatoes extends AbstractBarbecue{

    @Override
    public void stoker() {
        System.out.println("用煤炭生火");
    }

    @Override
    public void prepare() {
        System.out.println("准备红薯");
    }

    @Override
    public void barbecue() {
        System.out.println("烧烤红薯");
    }

    @Override
    public void taking() {
        System.out.println("红薯烤好了，可以吃了");
    }
}
