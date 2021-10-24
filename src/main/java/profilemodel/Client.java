package profilemodel;

public class Client {
    public static void main(String[] args) {
        AbstractBarbecue roastMeat = new RoastMeat();
        roastMeat.making();
        System.out.println("++++++++++++++++++++++++++++");
        AbstractBarbecue roastedSweetPotatoes = new RoastedSweetPotatoes();
        roastedSweetPotatoes.making();
    }
}
