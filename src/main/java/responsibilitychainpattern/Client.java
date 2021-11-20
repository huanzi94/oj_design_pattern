package responsibilitychainpattern;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        Handler handler = context.getHandles();
        System.out.println(handler.process(3));
    }
}
