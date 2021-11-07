package profilemodel;

/**
 * 烤肉
 */
public class RoastMeat extends AbstractBarbecue {
    @Override
    public void stoker() {
        System.out.println("用火柴生火");
    }

    @Override
    public void prepare() {
        System.out.println("准备五花肉~");
    }

    @Override
    public void barbecue() {
        System.out.println("把肉放在火上烧烤");
    }

    @Override
    public void taking() {
        System.out.println("肉考好了，可以吃了~");
    }
}
